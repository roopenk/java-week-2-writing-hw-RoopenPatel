package homework_week_6;

/** Write a java program that takes three numbers as inputs to calculate
 * and print the average of the numbers
 */
import java.util.Scanner;
public class Program_13_AverageOfNumbers {
    public static void main(String[] args) {
        // scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number : ");
        double x = scan.nextDouble();
        System.out.println("PLease Enter The Second Number : ");
        double y = scan.nextDouble();
        System.out.println("Please Enter The Third Number : ");
        double z = scan.nextDouble();
        // closing the scanner object
        scan.close();
        averageOfThreeNumbers(x,y,z);
    }
    // Calculating the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c){
        double average = (a + b + c) / 3;
        System.out.println("The Average Of " + a + " , " + b + " And " + c + " Is : " + average);
    }
}
