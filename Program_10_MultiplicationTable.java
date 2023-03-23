package homework_week_6;

/** Write a java program that takes a number as an input and prints its
 * multiplication table up to 10
 * Test data: Input a number : 8
 * Expected output:
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
import java.util.Scanner;
public class Program_10_MultiplicationTable {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number : ");
        int number = scan.nextInt();
        // closing scanner object
        scan.close();
        multiplicationTableOf(number);
    }
    // method to print the multiplication table of given number
    public static void multiplicationTableOf(int number){
        System.out.println(number + " x "+ 1 + " = " + (number));
        System.out.println(number + " x "+ 2 + " = " + (number * 2));
        System.out.println(number + " x "+ 3 + " = " + (number * 3));
        System.out.println(number + " x "+ 4 + " = " + (number * 4));
        System.out.println(number + " x "+ 5 + " = " + (number * 5));
        System.out.println(number + " x "+ 6 + " = " + (number * 6));
        System.out.println(number + " x "+ 7 + " = " + (number * 7));
        System.out.println(number + " x "+ 8 + " = " + (number * 8));
        System.out.println(number + " x "+ 9 + " = " + (number * 9));
        System.out.println(number + " x "+ 10 + " = " + (number * 10));
    }
}
