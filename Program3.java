package homework_week_6;

/** Write a java program using the following steps:
 *  3.1 Declare one instance and one static variable.
 *  3.2 Declare one instance method.
 *  3.3 Declare one static method.
 *  3.4 Call both instance and static variables into the static and instance methods inside the print statement.
 *  3.5 Declare the main method.
 *  3.6 Call both static and instance methods into the main method.
 */
public class Program3 {
    // 3.1 Declare one instance and one static variable
    String name = "Prime";
    static String surname = "Testing";

    // 3.2 Declare one instance method.
    // 3.4 Call both instance and static variables in the instance method inside the print statement.
    public void instanceMethod(){
        Program3 obj = new Program3();
        System.out.println(name);
        System.out.println(obj.surname);
    }
    // 3.3 Declare one static method.
    // 3.4 Call both static and instance variables into the static method inside the print statement.
    public static void staticMethod(){
        Program3 obj = new Program3();
        System.out.println(obj.name);
        System.out.println(surname);
    }
    // 3.5 Declare the main method.
    // 3.6 Call both instance and static methods into the main method and run the program.
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.instanceMethod();
        staticMethod();
    }
}
