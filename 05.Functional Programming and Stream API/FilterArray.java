import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem 01
 */
public class FilterArray {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arrayOfStrings = input.nextLine().split(" ");

        Arrays.stream(arrayOfStrings)
                .filter(p -> p.length() > 3)
                .forEach(p -> System.out.printf("%s ",p));
    }
}
