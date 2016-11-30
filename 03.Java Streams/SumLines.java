package org.softuni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *   Problem 01. Sum Lines
 */

public class SumLines {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("lines1.txt"));

        int result = 0;
        String line;
        ArrayList<Integer> results = new ArrayList<>();
        while ((line = read.readLine()) != null) {

            for (int i = 0; i < line.length(); i++) {

                result += line.charAt(i);
            }

            results.add(result);
            result = 0;
        }

        for (int item : results ) {

            System.out.println(item);
        }

        read.close();
    }

}

