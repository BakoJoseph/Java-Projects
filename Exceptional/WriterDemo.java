package Exceptional;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public void writing(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\USER\\Documents\\io\\io.txt");
            fileWriter.write("Joseph");
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.out.println(e.getCause());
        }
        finally {
            if(fileWriter != null) try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getCause());
            }
        }
    }

    public void reading()throws  IOException, FileNotFoundException {
        FileReader fileReader = null;
            fileReader = new FileReader("C:\\Users\\USER\\Documents\\io\\io.txt");
            System.out.println( fileReader.read());
            System.out.println("Exception occurred");
            //System.out.println(e.getCause());

    }

    public void writingText(){
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\Documents\\io\\io.txt");){
            fileWriter.write("TRY WITH RESOURCE");
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.out.println(e.getCause());
        }
    }

    public static void main(String[] args) {
        WriterDemo writerDemo = new WriterDemo();
        writerDemo.writingText();
        /**
        try {
            writerDemo.reading();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         **/

    }
}
