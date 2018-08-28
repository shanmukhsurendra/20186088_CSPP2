import java.util.Scanner;
/**
 *swapping two program.
 */
public final class Swap {
    /**
    *swap class.
    */
    private HelloWorld() {
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
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
