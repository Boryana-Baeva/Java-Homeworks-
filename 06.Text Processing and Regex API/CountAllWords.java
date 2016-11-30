package org.softuni;

import java.util.Scanner;

/**
 * Problem 4.
 */
public class CountAllWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\W+");
        input.close();
        int count = 0;

        for (String word : text) {

            count++;
        }
        System.out.println(count);
    }
}
