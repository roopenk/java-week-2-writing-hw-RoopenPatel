package homework_week_6;

/**
 * Write a java program to swap two numbers
 */

import java.util.Scanner;

public class Program_15_SwapTheValue {
    public static void main(String[] args) {
        // scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number : ");
        int first = scan.nextInt();
        System.out.println("Please Enter The Second Number : ");
        int second = scan.nextInt();
        // closing the scanner object
        scan.close();
        Program_15_SwapTheValue obj = new Program_15_SwapTheValue();
        obj.swapTheValue(first, second);
    }

    // Swapping the Values of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before The Swapping, The Values Of First Number Is : " + a + " And The Second Number Is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After The Swapping, The Values Of First Number Is : " + a + " And The Second Number Is : " + b);

    }
}
