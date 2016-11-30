package org.softuni;

import java.util.Scanner;

/**
 * Problem 2.
 */
public class CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().toLowerCase().split("\\s+");
        String substring = input.nextLine().toLowerCase();
        input.close();
        int occurrenceCount= 0;
        for (int i = 0; i < text.length ; i++) {

           occurrenceCount += countOccurrences(text[i],substring);
        }
        System.out.println(occurrenceCount);
    }

    public static int countOccurrences(String word, String substring) {

        int counter = 0;
        int index = 0;

        while ((index = word.indexOf(substring,index)) != -1){
            index++;
            counter++;
        }
        return counter;

    }
}
