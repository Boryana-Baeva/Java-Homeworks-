/**
 *   Problem 5.	* Print a Character Triangle
 */
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 'a'; i < 'a' + number; i++) {

            for (char j = 'a'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 'a'+ number - 2 ; i >= 'a'; i--) {

            for (char j = 'a' ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
