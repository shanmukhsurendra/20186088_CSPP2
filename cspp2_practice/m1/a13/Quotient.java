import java.util.Scanner;
/**
 *qoutient and reminder program.
 */
public final class Quotient {
    /**
    *swap class.
    */
    private Quotient() {
        //hgdh.
    }
    /**
    *@param args of type int[].
    */
    public static void main(final String[] args) {
        /**
        * main function
        */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c, d;
        c = a / b;
        d = a % b;
        System.out.println(c + " " + d);
    }
}
