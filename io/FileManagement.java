package io;

import java.io.File;
import java.io.IOException;

public class FileManagement {
    static void create(){
        String fileName = "joshus.txt";
        File file = new File("C:\\Users\\USER\\Documents\\io\\"+fileName);
        try {
           boolean isFileCreated =  file.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        FileManagement.create();
    }
}
