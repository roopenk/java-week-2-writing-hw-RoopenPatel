package homework_week_6;
// Write a java program to accept radius value from user and find out the area (Formula : A=PI*r*r)
import java.util.Scanner;
public class Program_6_AreaOfCircle {
    public static void main(String[] args) {
        // scanner declaration to accept the radius value from console
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter the Radius Value : ");
        double radius = scan.nextDouble();
        areaOfCircle(radius);
        scan.close();
    }
    // Calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area Of Circle Is : " + area);
    }
}
