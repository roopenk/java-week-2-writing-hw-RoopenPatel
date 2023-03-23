package homework_week_6;

/** Write a java program to print the sum (addition), multiplication, subtraction, division and the remainder
 * of two given numbers
 * Test data:
 * Input first number : 125
 * input second number : 24
 * Expected output:
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
import java.util.Scanner;
public class Program_18_PrintOperation {
    public static void main(String[] args) {
        // scanner declaration to accept inout from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number : ");
        int firstNumber = scan.nextInt();
        System.out.println("PLease Enter Second Number : ");
        int secondNumber = scan.nextInt();
        // closing scanner object
        scan.close();
        Program_18_PrintOperation obj = new Program_18_PrintOperation();
        obj.printTheOperation(firstNumber, secondNumber);
    }
    // Printing all operations
    public void printTheOperation(int a, int b){
        System.out.println("The Addition Of " + a + " And " + b + " Is " + (a + b));
        System.out.println("The Difference Of " + a + " And " + b + " Is " + (a - b));
        System.out.println("The Product Of " + a + " And " + b + " Is " + (a * b));
        System.out.println("The Division Of " + a + " And " + b + " Is " + (a / b));
        System.out.println("The Remainder Of " + a + " And " + b + " Is " + (a % b));
    }
}
