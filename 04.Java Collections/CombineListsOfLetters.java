package org.softuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem 7
 */
public class CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        String secondline = input.nextLine();
        input.close();
        String combined = "";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < firstLine.length(); i++) {
            char current1 = firstLine.charAt(i);
            list.add(current1);
        }
        combined += firstLine;
        for (int i = 0; i < secondline.length(); i++) {
            char current2 = secondline.charAt(i);
            if (list.contains(current2)) {
                continue;
            } else {
                combined += " " + current2;
            }
        }
        System.out.println(combined);
    }
}
