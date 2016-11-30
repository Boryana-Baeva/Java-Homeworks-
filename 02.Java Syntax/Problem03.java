package org.softuni;
import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 * Problem 3. Formatting Numbers
 */
public class Problem03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);
        String paddedBinary = String.format("%1$10s",binary).replace(' ','0');
        System.out.printf("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|",hex,paddedBinary,b,c);


    }
}
