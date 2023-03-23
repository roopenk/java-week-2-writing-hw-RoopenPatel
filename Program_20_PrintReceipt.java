package homework_week_6;

/** Write a java program to print a receipt as follows:
 * +-----------------------------+
 * |                             |
 * |        CORNER STORE         |
 * |                             |
 * |    2015-03-29 04:38 PM      |
 * |    Gallons:     10.870      |
 * |  Price/gallon : 2.089       |
 * |                             |
 * |   Fuel Total: $ 22.71       |
 * |                             |
 * +-----------------------------+
 */

public class Program_20_PrintReceipt {
    public static void main(String[] args) {
        printReceipt();
    }
    // method to pint the receipt
    public static void printReceipt(){
        System.out.println("+-----------------------------+");
        System.out.println("|                             |");
        System.out.println("|        CORNER STORE         |");
        System.out.println("|                             |");
        System.out.println("|    2015-03-29 04:38 PM      |");
        System.out.println("|    Gallons:     10.870      |");
        System.out.println("|    Price/gallon : 2.089     |");
        System.out.println("|                             |");
        System.out.println("|   Fuel Total: $ 22.71       |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
    }
}
