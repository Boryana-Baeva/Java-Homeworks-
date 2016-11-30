package org.softuni;
import java.util.*;
/**
 * Problem 7.	Randomize numbers from N to M
 */
public class Problem07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int smaller = Math.min(m, n);
        int greater = Math.max(m, n);

        List<Integer> numbers = new ArrayList<>();

        for (int i = smaller; i <= greater; i++) {

            numbers.add(i);
            Collections.shuffle(numbers);
        }

        for (int number : numbers) {

            System.out.print(number + " ");
        }
    }
}
