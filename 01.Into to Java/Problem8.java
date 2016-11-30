/**
 *   Problem 8.	**Get Average
 */

import java.util.Locale;
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);

        double firstNumber = first.nextDouble();
        double secondNumber = second.nextDouble();
        double thirdNumber = third.nextDouble();

        double average = GetAverage(firstNumber,secondNumber,thirdNumber);
        System.out.printf("%.2f",average);
    }

    public static double GetAverage(double a, double b, double c) {

        return (a + b + c)/3;
    }
}
