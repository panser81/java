package com.gmail.panser81.lesson15.services.repositories;

import com.gmail.panser81.lesson15.services.FileRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileRepositoryImpl implements FileRepository {
    @Override
    public void createFile(String fileName, String content) throws Exception {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            bufferedWriter.write(content);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    public String readFile(String fileName) throws Exception {
        File file = new File(fileName);
        StringBuilder sourceString = new StringBuilder();

        try (Scanner myReader = new Scanner(file)) {

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sourceString.append(data + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }

        return sourceString.toString();
    }
}
