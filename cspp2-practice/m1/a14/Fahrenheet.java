import java.util.Scanner;
/**
 *fahrenheet program.
 */
public final class Fahrenheet {
    /**
    *fahrenheet class.
    */
    private Fahrenheet() {
        //hasdf.
    }
    /**
    *@param args of type int[].
    */
    public static void main(final String[] args) {
        /**
        * main function
        */
        Scanner in = new Scanner(System.in);
        double a = in.nextInt(), f;
        f = ((9 * a) / 5) + 32;
        System.out.println(f);
    }
}
