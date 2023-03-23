package homework_week_6;

/** Write a java program to convert a given string into lowercase
 * sample input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
 * Expected output : the quick brown fox jumps over the lazy dog
 */
import java.util.Scanner;
public class Program_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        // scanner declaration to accept the input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Upper Case Sentence : ");
        String uppercase = scan.nextLine();
        // closing scanner object
        scan.close();
        Program_19_ConvertStringToLowerCase obj = new Program_19_ConvertStringToLowerCase();
        obj.convertStringToLowerCase(uppercase);
        }
        // Converting string to lowercase
    public void convertStringToLowerCase(String str){
        System.out.println("The Equivalent Lowercase String Is : " + str.toLowerCase());
    }
    }

