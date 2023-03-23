package homework_week_6;

/**
 * Write a java program to accept any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F - 32) * 5 / 9 = 0 C)
 */

import java.util.Scanner;

public class Program_7_TempConversion {
    public static void main(String[] args) {
        // scanner declaration to accept the value from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Temperature in  Fahrenheit : ");
        float temp = scan.nextFloat();
        // object creation
        Program_7_TempConversion obj = new Program_7_TempConversion();
        obj.convertTempToDegreeCelsius(temp);
        // scanner closing
        scan.close();
    }

    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The Temperature " + temp + " Fahrenheit Equals To " + c + " Degree Celsius");
    }
}
