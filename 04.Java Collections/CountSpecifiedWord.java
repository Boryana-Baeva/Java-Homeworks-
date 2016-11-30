package org.softuni;

import java.util.Scanner;

/**
 * Problem 6
 */
public class CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] sentence = input.nextLine().toLowerCase().split("[\\p{Punct}\\s]+");
        String specifiedWord = input.next();
        int counter = 0;
        for (String word: sentence) {

           if (word.equals(specifiedWord)){
               counter++;
           }
        }
        System.out.println(counter);
    }
}
