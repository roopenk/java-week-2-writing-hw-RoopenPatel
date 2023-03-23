package homework_week_6;

/** Write a java program to compute the specified expressions and
 * print the output
 * Test data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected output : 2.138888888888889
 */
public class Program_12_PrintExpression {
    public static void main(String[] args) {
        Program_12_PrintExpression obj = new Program_12_PrintExpression();
        obj.printExpressions();
    }
// Printing Expression
    public void printExpressions(){
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }
}
