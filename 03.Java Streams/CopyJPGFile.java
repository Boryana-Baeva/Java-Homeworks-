package org.softuni;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Problem 4.	Copy .jpg File
 */
public class CopyJPGFile {

    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("dark-side.jpg");
        FileOutputStream output = new FileOutputStream("my-copied-picture.jpg");
        int byteContainer;
        while((byteContainer = input.read())!=-1)
        {
            output.write(byteContainer);
        }
        input.close();
        output.close();
    }
}
