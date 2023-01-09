package com.gmail.panser81.lesson14.services.impl;

import com.gmail.panser81.lesson14.constants.LessonConstants;
import com.gmail.panser81.lesson14.models.Product;
import com.gmail.panser81.lesson14.services.FileRepository;
import com.gmail.panser81.lesson14.services.LessonService;
import com.gmail.panser81.lesson14.services.Mapper;
import com.gmail.panser81.lesson14.services.repositories.FileRepositoryImpl;

import java.util.List;

public class DeserializeLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private Mapper productsMapper = new ProductMapperImpl();

    @Override
    public void execute() throws Exception {
        String fileName = String.format("%s/%s", LessonConstants.DIRECTORY_NAME, LessonConstants.FILE_NAME);
        String productsStr = fileRepository.readFile(fileName);

        List<Product> products = productsMapper.map(productsStr);

        for (Product product : products) {
            product.print();
        }
    }
}
