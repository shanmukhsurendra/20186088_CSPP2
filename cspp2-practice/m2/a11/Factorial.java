import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Factorial {
    /**
     * Constructs the object.
     */
    private Factorial() {
        //fdg.
    }
    /**
     * { function_description }.
     *
     * @param      n     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    static int facto(final int n) {
        /**
         * { to return factorial value}.
         */
        if (n == 1) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { reads input from user using scanner}.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = facto(n);
        System.out.println(result);
    }
}
