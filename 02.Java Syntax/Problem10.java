package org.softuni;
import java.util.Scanner;
/**
 * Problem 10. Character Multiplier
 */
public class Problem10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();

        long result = characterMultiplier(firstString, secondString);

        System.out.println(result);
    }

    public static long characterMultiplier(String str1, String str2) {

        long sum = 0;
        int shorter = Math.min(str1.length(),str2.length());
        int longer = Math.max(str1.length(),str2.length());


        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                long product = str1.charAt(i) * str2.charAt(i);
                sum += product;
            }
        }
        else {

            int difference = longer - shorter;
            int index = longer - difference - 1;
            for (int i = 0; i < shorter; i++) {

                long product = str1.charAt(i) * str2.charAt(i);
                sum += product;
            }
            while (difference > 0) {

                if (longer == str1.length()){

                    sum += str1.charAt(index);
                }
                else if (longer == str2.length() ){

                    sum += str2.charAt(index);
                }
                difference--;
                index++;
            }
        }
        return sum;
    }
}
