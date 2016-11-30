package org.softuni;

import java.util.Scanner;

/**
 * Problem 2. Triangle Area    ( Видях,че има по-къса формула след като вече бях решила задачата)
 */
public class Problem02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int xA = input.nextInt();
        int yA = input.nextInt();
        input.nextLine();
        int xB = input.nextInt();
        int yB = input.nextInt();
        input.nextLine();
        int xC = input.nextInt();
        int yC = input.nextInt();

        double a = calculateTriangleSide(xA, xC, yA, yC);
        double b = calculateTriangleSide(xB, xC, yB, yC);
        double c = calculateTriangleSide(xA, xB, yA, yB);

        if (c < a + b && a < c + b && b < a + c) {  // Condition for 3 length sides to form a triangle

            double area = calculateArea(a, b, c);
            System.out.println(Math.round(area));
        } else {
            System.out.println("0");
        }

    }

    public static double calculateTriangleSide(double x1, double x2, double y1, double y2) {

        double xDifference = x2 - x1;
        double yDifference = y2 - y1;
        double sideDouble = Math.pow(xDifference, 2) + Math.pow(yDifference, 2);

        return Math.sqrt(sideDouble);
    }

    public static double calculateArea(double a, double b, double c) {
        /**
         * Heron's Formula for the area of a triangle
         * http://www.mathopenref.com/heronsformula.html
         */
        double p = (a + b + c) / 2;
        double areaDouble = p * (p - a) * (p - b) * (p - c);

        return Math.sqrt(areaDouble);
    }
}
