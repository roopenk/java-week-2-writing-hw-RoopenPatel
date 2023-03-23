package homework_week_6;

/** Write a java program to add two binary numbers
 * Input data:
 * Input first binary number : 10
 * Input second binary number : 11
 */
import java.util.Scanner;
public class Program_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("WelCome To Java Program To Add Two Binary Numbers");
        // scanner declaration to accept inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Binary Number : ");
        String first =scan.nextLine();
        System.out.println("PLease Enter Second Binary NUmber : ");
        String second =scan.nextLine();
        // closing scanner object
        scan.close();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The Addition Of Two Binary Numbers Is : " + addition);
    }
    // Adding the two binary numbers
    public static String addTwoBinaryNumbers(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
