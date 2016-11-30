/**
 *  Problem 7.	*Ghetto Numeral System
 */
import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        int n = number;

        while (n>0){
            n = n / 10;
            count++;
        }

        String expression = "";

        while (count > 0) {
            int digit = number / (int)Math.pow(10,count-1);
            number = number %(int)Math.pow(10,count-1);
            count --;
            String word = Integer.toString(digit);
            switch (word) {
                case "0":word = "Gee";break;
                case "1":word = "Bro";break;
                case "2":word = "Zuz";break;
                case "3":word = "Ma";break;
                case "4":word = "Duh";break;
                case "5":word = "Yo";break;
                case "6":word = "Dis";break;
                case "7":word = "Hood";break;
                case "8":word = "Jam";break;
                case "9":word = "Mack";break;
            }
            expression += word;
        }
        System.out.println(expression);
    }
}
