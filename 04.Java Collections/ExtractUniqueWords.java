package org.softuni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *  Problem 8
 */
public class ExtractUniqueWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().toLowerCase().split("[ .?:]+");
        input.close();
        List<String> sentences = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            String current = text[i];
            if (!sentences.contains(current)) {
                sentences.add(current);
            }
        }
        Collections.sort(sentences);

        for (String word : sentences) {
            System.out.print(word + " ");
        }

    }
}
