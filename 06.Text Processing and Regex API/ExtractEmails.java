package org.softuni;

/**
 * Problem 1.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();

        Pattern p = Pattern.compile("[\\-\\.A-Za-z0-9]+@[A-Za-z\\.\\-]+\\.[a-z]+");
        Matcher m = p.matcher(text);

        while (m.find()) {

            System.out.println(m.group());
        }
    }
}
