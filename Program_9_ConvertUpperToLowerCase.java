package homework_week_6;

/** Write a java program to convert any upper case string to equivalent lower case string
 *
 */
import java.util.Scanner;
public class Program_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        // scanner declaration to accept the input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Upper Case String : ");
        String uppercase = scan.nextLine();
        Program_9_ConvertUpperToLowerCase obj = new Program_9_ConvertUpperToLowerCase();
        obj.convertUpperCaseToLowerCase(uppercase);
        // closing scanner object
        scan.close();
    }
    // Conversion of Uppercase to Lowercase method
    public void convertUpperCaseToLowerCase(String text){
        System.out.println("The Equivalent Lower Case Value Is : " + text.toLowerCase());
    }
}
