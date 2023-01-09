package com.gmail.panser81.lesson14.services.impl;

import com.gmail.panser81.lesson14.constants.LessonConstants;
import com.gmail.panser81.lesson14.services.*;
import com.gmail.panser81.lesson14.services.repositories.FileRepositoryImpl;


public class CreateDirectoriesLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();

    @Override
    public void execute() throws Exception {
        fileRepository.createDirectory(LessonConstants.DIRECTORY_NAME);
        System.out.println("Directory was created");
    }
}
