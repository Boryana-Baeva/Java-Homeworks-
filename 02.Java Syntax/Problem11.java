package org.softuni;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *   Problem 11. Get first odd or even elements
 */
public class Problem11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] firstLine = input.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < firstLine.length; i++) {

            numbers.add(Integer.parseInt(firstLine[i]));
        }

        String[] secondLine = input.nextLine().split(" ");
        int countOfNumbers = Integer.parseInt(secondLine[1]);
        String typeOfNumbers = secondLine[2];

        getFirstOddOrEvenElements(numbers,countOfNumbers,typeOfNumbers);
    }

    public static int getFirstOddOrEvenElements(List<Integer> num, int count, String type) {

        if (type.equals("even")) {


            for (int i = 0; i < num.size(); i++) {

                if (num.get(i) % 2 == 0) {
                    System.out.print(num.get(i) + " ");
                    count--;
                    if (count == 0) {
                        break;
                    }
                }
            }
        }
        else {

            for (int i = 0; i < num.size(); i++) {

                if (num.get(i) % 2 != 0) {
                    System.out.print(num.get(i) + " ");
                    count--;
                    if (count == 0) {
                        break;
                    }
                }
            }
        }
        return 1;
    }
}