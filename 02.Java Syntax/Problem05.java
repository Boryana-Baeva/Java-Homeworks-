package org.softuni;

import java.util.Scanner;

/**
 *  Problem 5. Convert from decimal system to base-7
 */
public class Problem05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(Integer.toString(number,7));

    }
}
