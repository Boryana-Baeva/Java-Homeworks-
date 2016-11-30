package org.softuni;
import java.util.Scanner;
/**
 * Problem 9.* Hit the target
 */
public class Problem09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int firstAddend = 1;
        int secondAddend = target - 1;

        for (int i = 1; i <= target; i++) {

            System.out.printf("%1$d + %2$d = %3$d", firstAddend, secondAddend, target);
            System.out.println();
            firstAddend++;
            secondAddend--;

            if (i >= 20) {
                break;
            }
        }

        for (int j = target + 1; j <= 20; j++) {

            System.out.printf("%1$d - %2$d = %3$d", firstAddend, Math.abs(secondAddend), target);
            System.out.println();
            firstAddend++;
            secondAddend--;
        }
    }
}
