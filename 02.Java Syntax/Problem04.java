package org.softuni;
import java.util.Locale;
import java.util.Scanner;
/**
 * Problem 4. Calculate Expression
 */
public class Problem04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double firstBase = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
        double firstExponent = (a + b + c) / Math.sqrt(c);
        double firstFormula = Math.pow(firstBase, firstExponent);

        double secondBase = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        double secondExponent = a - b;
        double secondFormula = Math.pow(secondBase, secondExponent);

        double numbersAverage = (a + b + c) / 3;
        double formulaAverage = (firstFormula + secondFormula)/2;
        double difference = Math.abs(numbersAverage - formulaAverage);

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",
                firstFormula,secondFormula,difference);
    }
}
