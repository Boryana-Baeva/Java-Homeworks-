package org.softuni;

import java.io.*;

/**
 * Problem 02. All Capitals!
 */
public class AllCapitals {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(
                                    new FileReader("lines2.txt"));

        String line;
        String text = "";

        while ( (line = read.readLine()) != null) {

            text += line.toUpperCase() + "\r\n";
        }

        PrintWriter print = new PrintWriter(
                                    new BufferedWriter(
                                        new FileWriter("lines2.txt")));

        print.write(text);
        print.flush();
        read.close();
        print.close();
    }
}
