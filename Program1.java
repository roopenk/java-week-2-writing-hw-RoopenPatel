package homework_week_6;

/** Write a Java program using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into instance method inside the print statement.
 * 1.4 Declare the main method.
 * 1.5 Call the above instance method into main method and run the program.
 */

public class Program1 {
    // 1.1 Declare two instance variables.
    int a = 10;
    int b = 20;

    // 1.2 Declare one instance method.
    // 1.3 call both instance variables into the instance method inside the print statement.

    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    // 1.4 Declare the main method
    // 1.5 Call above instance method into the main method and run the program.
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.instanceMethod();
    }
}
