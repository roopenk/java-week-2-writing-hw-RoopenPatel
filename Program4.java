package homework_week_6;

/** Write a java program using the following steps:
 * 4.1 Declare two instance and two static variables
 * 4.2 Declare one instance method
 * 4.3 Declare one static method
 * 4.4 Call all four variables into both instance and static methods inside the print statement
 * 4.5 Declare the main method
 * 4.6 Call both instance and static methods into the main method and run the program
 */
public class Program4 {
    // 4.1 Declare two instance and two static variables
    // instance variables:
    String name = "Prime";
    String surname = "Testing";
    // static variables:
    static boolean a = true;
    static boolean b = false;

    // 4.2 Declare one instance method
    // 4.4 Call all four instance and static variables into the instance method inside the print statement
    public void instanceMethod(){
        Program4 obj = new Program4();
        System.out.println(name);
        System.out.println(surname);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    // 4.3 Declare one static method
    // 4.4 Call all four instance and static variables into the static method inside the print statement
    public static void staticMethod(){
        Program4 obj = new Program4();
        System.out.println(obj.name);
        System.out.println(obj.surname);
        System.out.println(a);
        System.out.println(b);
    }
    // 4.5 Declare the main method
    // 4.6 Call both the instance and static methods into the main method and run the program
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.instanceMethod();
        staticMethod();
    }
}
