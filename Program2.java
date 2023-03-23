package homework_week_6;

/** Write a java program using the following steps:
 * 2.1 Declare two static variables.
 * 2.2 Declare one static method.
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the main method.
 * 2.5 Call the statuc method into the main method and run the program.
 */
public class Program2 {
    //2.1 Declare two static variables
    static int a = 10;
    static int b = 20;

    // 2.2 Declare one static method
    // 2.3 Call both static variables into the static method inside the print statement
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    // 2.4 Declare the main method
    // 2.25 Call the static method in the main method
    public static void main(String[] args) {
        staticMethod();
    }
}
