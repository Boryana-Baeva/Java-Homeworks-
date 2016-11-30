package org.softuni;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem 5.
 */
public class ExtractWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String words = input.nextLine();

        Pattern p = Pattern.compile("[A-Z|a-z]+");
        Matcher m = p.matcher(words);

        while (m.find()) {

            System.out.printf(m.group() + " ");
        }

    }
}
