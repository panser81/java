package com.gmail.panser81.lesson14.services.impl;

import com.gmail.panser81.lesson14.constants.LessonConstants;
import com.gmail.panser81.lesson14.services.FileRepository;
import com.gmail.panser81.lesson14.services.LessonService;
import com.gmail.panser81.lesson14.services.repositories.FileRepositoryImpl;

public class CreateFileLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();

    @Override
    public void execute() throws Exception {
        StringBuilder productsBuilder = new StringBuilder();

        productsBuilder.append("Name;UniqueNumber;Price;Count;Production\n");
        productsBuilder.append("Windows 10;00001;2000;20;Microsoft\n");
        productsBuilder.append("Usb flash drive;4561;500;100;Samsung\n");
        productsBuilder.append("Dell x-01;200232;1000;3500;DELL\n");
        productsBuilder.append("Dell ODF-01;3459834;5000;10;DELL\n");
        productsBuilder.append("ASUS 5000;45600001;980;150;ASUS\n");

        String filePath = LessonConstants.DIRECTORY_NAME + "/" + LessonConstants.FILE_NAME;

        fileRepository.createFile(filePath, productsBuilder.toString());

        System.out.println("File was created");
    }
}
