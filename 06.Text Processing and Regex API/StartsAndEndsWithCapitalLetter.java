package org.softuni;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem 6.
 */
public class StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputArray = input.nextLine();
        StringBuilder output = new StringBuilder();
        Pattern p = Pattern.compile("\\b[A-Z]+([a-zA-Z]*?)[A-Z]+\\b");
        Matcher m = p.matcher(inputArray);

        while (m.find()){

            output.append(m.group()).append(" ");
        }
        System.out.println(output);
    }
}
