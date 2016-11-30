package org.softuni;

import java.util.Scanner;

/**
 * Problem 6. Convert from base-7 to decimal
 */
public class Problem06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.next();
        int decimalNumber = Integer.parseInt(number, 7);
        System.out.println(decimalNumber);

    }
}
