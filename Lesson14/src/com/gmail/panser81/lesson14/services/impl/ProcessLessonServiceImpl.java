package com.gmail.panser81.lesson14.services.impl;

import com.gmail.panser81.lesson14.constants.LessonConstants;
import com.gmail.panser81.lesson14.models.Product;
import com.gmail.panser81.lesson14.services.*;
import com.gmail.panser81.lesson14.services.repositories.FileRepositoryImpl;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ProcessLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private Mapper productsMapper = new ProductMapperImpl();

    @Override
    public void execute() throws Exception {
        String fileName = String.format("%s/%s", LessonConstants.DIRECTORY_NAME, LessonConstants.FILE_NAME);
        String productsStr = fileRepository.readFile(fileName);

        List<Product> products = productsMapper.map(productsStr);

        Comparator<Product> minPriceComparator = Comparator.comparing(Product::getPrice);

        Product minPriceProduct = products.stream().min(minPriceComparator)
                .orElseThrow(NoSuchElementException::new);

        minPriceProduct.print();
    }
}
