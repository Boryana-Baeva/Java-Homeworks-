import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem 02.
 */
public class SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arrayOfIntegers  = input.nextLine().split(" ");
        String sortingOrder = input.nextLine();

        if (sortingOrder.equals("Ascending")){

            Arrays.stream(arrayOfIntegers)
                    .map( p -> Integer.parseInt(p))
                    .sorted()
                    .forEach(p -> System.out.printf("%d ", p));
        }
        else if (sortingOrder.equals("Descending")){

            Arrays.stream(arrayOfIntegers)
                    .map( p -> Integer.parseInt(p))
                    .sorted((p1,p2) -> p2.compareTo(p1))
                    .forEach(p -> System.out.printf("%d ", p));

        }
    }
}
