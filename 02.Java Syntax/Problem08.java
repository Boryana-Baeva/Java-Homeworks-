package org.softuni;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Problem 8.	*Odd and Even Pairs
 */
public class Problem08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] array = input.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            numbers.add(Integer.parseInt(array[i]));
        }

        if (numbers.size() % 2 == 0) {

            for (int i = 0; i < numbers.size(); i += 2) {

                if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {

                    System.out.printf("%1$d, %2$d -> both are even", numbers.get(i), numbers.get(i + 1));
                    System.out.println();
                } else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {

                    System.out.printf("%1$d, %2$d -> both are odd", numbers.get(i), numbers.get(i + 1));
                    System.out.println();
                } else {

                    System.out.printf("%1$d, %2$d -> different", numbers.get(i), numbers.get(i + 1));
                    System.out.println();
                }
            }
        } else {

            System.out.println("Invalid length");
        }
    }
}
