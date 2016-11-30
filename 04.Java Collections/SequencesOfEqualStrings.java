package org.softuni;

import java.util.Scanner;

/**
 * Problem 2
 */
public class SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arrayOfStrings = input.nextLine().split(" ");
        input.close();

        System.out.print(arrayOfStrings[0]);
        for (int i = 1; i < arrayOfStrings.length; i++) {



            if (arrayOfStrings[i].equals(arrayOfStrings[i-1])) {

                System.out.print(" " + arrayOfStrings[i]);
            } else {
                System.out.println();
                System.out.print(arrayOfStrings[i]);
            }
        }

    }
}
