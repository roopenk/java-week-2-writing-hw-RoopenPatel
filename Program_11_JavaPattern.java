package homework_week_6;

/** Write a java program to display the following pattern
 * Sample pattern:
 * J a v v a
 * J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a a
 */

public class Program_11_JavaPattern {
    public static void main(String[] args) {
        Program_11_JavaPattern obj = new Program_11_JavaPattern();
        System.out.println("-------------------------------");
        obj.javaPattern();
    }
    // Printing the Java pattern
    public void javaPattern(){
        System.out.println("J a v v a ");
        System.out.println("J a a v v a a ");
        System.out.println("J J aaaaa V V aaaaa ");
        System.out.println("J J a a V a a ");
    }
}
