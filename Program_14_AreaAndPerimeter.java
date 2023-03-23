package homework_week_6;

/** Write a java program to print the area and perimeter of a rectangle
 * Test data:
 * Width = 5.5 , Height = 8.5
 * Expected output:
 * Area is 5.6 * 8.5  = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
import java.util.Scanner;
public class Program_14_AreaAndPerimeter {
// calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(double height, double width){
        double perimeter = 2 * (height + width);
        double area = (height * width);
        System.out.println("The Area Of The Rectangle Is : " + area);
        System.out.println("The Perimeter Of The Rectangle Is : " + perimeter);
    }

    public static void main(String[] args) {
        // scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Height Of The Rectangle : ");
        double height = scan.nextDouble();
        System.out.println("Please Enter The Width Of The Rectangle : ");
        double width = scan.nextDouble();
        // closing scanner object
        scan.close();
        areaAndPerimeterOfRectangle(height, width);
    }
}
