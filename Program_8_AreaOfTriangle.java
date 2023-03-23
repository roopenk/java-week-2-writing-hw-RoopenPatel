package homework_week_6;
/** Write a java program to calculate and print the area of a triangle
 *
 */
import java.util.Scanner;
public class Program_8_AreaOfTriangle {
    public static void main(String[] args) {
        // scanner declaration to accept the input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Length of The Triangle : ");
        int length = scan.nextInt();
        System.out.println("Please Enter The Height of The Triangle : ");
        int height = scan.nextInt();
        areaOfTriangle(height, length);
        // closing the scanner
        scan.close();
    }
    // Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int height, int length){
        int area = (length * height) / 2;
        System.out.println("The Area Of The Triangle Is : " + area);
    }

}
