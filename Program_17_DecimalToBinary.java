package homework_week_6;

/** Write a java program to convert a decimal number to binary number
 * Input data:
 * Input a Decimal Number : 5
 * Expected output:
 * Binary Number Is : 101
 */
import java.util.Scanner;
public class Program_17_DecimalToBinary {
    public static void main(String[] args) {
        // scanner declaration to accept input from console
        System.out.println("WelCome To Java Program To Convert Decimal To Binary Numbers");
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter Any Decimal Number : ");
        int number = scan.nextInt();
        // closing scanner object
        convertDecimalToBinary(number);
    }
    // Converting the decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The Equivalent Binary NUmber Is : " + binary);
    }
}
