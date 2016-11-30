package org.softuni;

import java.io.*;

/**
 * Problem 3.	Count character types.
 */
public class CountCharacterTypes {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(
                                    new FileReader("words.txt"));
        String line;
        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;
        while ((line = read.readLine()) != null) {

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {

                    vowelsCount++;
                } else if (line.charAt(i) == '.' || line.charAt(i) == ',' || line.charAt(i) == '!' || line.charAt(i) == '?') {

                    punctuationCount++;
                } else if (line.charAt(i) == ' ') {

                    continue;
                } else {
                    consonantsCount++;
                }

            }
        }

        PrintWriter write = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter("count-chars.txt")));

        write.write("Vowels:" + vowelsCount + "\n\r");
        write.write("Consonants:" + consonantsCount + "\n\r");
        write.write("Punctuation" + punctuationCount);

        write.flush();
        read.close();
        write.close();
    }
}
