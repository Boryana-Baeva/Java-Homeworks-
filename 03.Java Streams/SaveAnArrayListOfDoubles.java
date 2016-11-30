package org.softuni;
import java.io.*;
import java.util.ArrayList;
/**
 * Problem 5.	Save an ArrayList of doubles
 */
public class SaveAnArrayListOfDoubles {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream output = new ObjectOutputStream(
                                        new FileOutputStream("doubles.list"));

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(11.842);
        doubles.add(8.0);
        doubles.add(3.14);
        doubles.add(214.9);

        output.writeObject(doubles);
        output.flush();
        ObjectInputStream input = new ObjectInputStream(
                                            new FileInputStream("doubles.list"));
        System.out.println(input.readObject());
        input.close();
    }
}
