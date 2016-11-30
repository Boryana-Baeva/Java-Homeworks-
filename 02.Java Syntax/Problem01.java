package org.softuni;

import java.util.Scanner;

/**
 *    Problem 1. Rectangle Area
 */
public class Problem01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int area = sideA * sideB;
        System.out.println(area);

    }
}
