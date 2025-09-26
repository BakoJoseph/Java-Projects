package io;

import java.io.FileInputStream;

public class FileReadingDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Documents\\io\\io.txt");
            int avlBytes=fis.available();
            System.out.println("Available Bytes"+avlBytes);
            byte[] buff=new byte[avlBytes];
            System.out.println(buff);
            fis.read(buff,0,avlBytes);
            String str=new String(buff);
            System.out.println(str);
            fis.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
