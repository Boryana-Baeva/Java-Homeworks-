package org.softuni;

import java.util.Scanner;

/**
 * Problem 3.
 */
public class CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().toLowerCase().split("\\W+");
        String targetWord = input.nextLine().toLowerCase();
        input.close();
        int count = 0;

        for (String word : text) {

            if (word.equals(targetWord)) {

                count++;
            }
        }
        System.out.println(count);

    }
}
