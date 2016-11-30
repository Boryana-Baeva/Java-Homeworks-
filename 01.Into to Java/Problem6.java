/**
 *    Problem 6.  Sum numbers from 1 to N
 */

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {






















































































        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
