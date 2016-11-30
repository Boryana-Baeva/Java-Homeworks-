package org.softuni;

/**
 *       Problem 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        int[] arrayOfNumbers = new int[n];

        for (int i = 0; i < n ; i++) {

            arrayOfNumbers[i] = input.nextInt();
        }
        input.close();

        Arrays.sort(arrayOfNumbers);

        for (int item: arrayOfNumbers) {

            System.out.print(item + " ");
        }
    }
}
