package org.softuni;

import java.util.Scanner;

/**
 * Problem 5
 */
public class CountAllWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] sentence = input.nextLine().split("[\\p{Punct}\\s]+");
        int wordCounter = 0;

        for (String word: sentence) {

            wordCounter++;
        }
        System.out.println(wordCounter);
    }
}

