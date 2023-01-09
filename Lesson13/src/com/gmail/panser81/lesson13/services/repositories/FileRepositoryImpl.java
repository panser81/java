package com.gmail.panser81.lesson13.services.repositories;

import com.gmail.panser81.lesson13.services.FileRepository;

import java.io.*;
import java.util.Scanner;

public class FileRepositoryImpl implements FileRepository {

    public void writeFile(String path, String content) throws Exception {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

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

    public String readFile(File file) throws Exception {
        StringBuilder sourceString = new StringBuilder();

        try (Scanner myReader = new Scanner(file)) {

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sourceString.append(data);
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
