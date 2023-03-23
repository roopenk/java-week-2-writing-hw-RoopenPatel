package homework_week_6;

import java.util.Scanner;
public class Program_5_Calculator {
    // static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The Addition Of " + a + " And " + b + " Is : " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
    // instance methods
    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println("The Multiplication Of " + a + " And " + b + " Is : "+ result);
    }
    public int division(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        // Scanner declaration for reading the inputs from console:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number : ");
        int a = scan.nextInt();
        System.out.println("PLease Enter The Second Number : ");
        int b = scan.nextInt();

        addition(a,b);

        int subResult = subtraction(a,b);
        System.out.println("The Subtraction Of " + a + " And " + b + " Is : "+ subResult);

        Program_5_Calculator obj = new Program_5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a,b);
        System.out.println("The Division Of " + a + " And " + b + " Is : "+ divResult);
        // Clod=sing the scanner object
        scan.close();
    }
}
