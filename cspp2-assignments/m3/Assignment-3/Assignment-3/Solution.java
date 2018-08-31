
import java.util.Scanner;
/**
    Do not modify this main function.
    */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //afgagf.
    }
    /**
     * { function_description }.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    static int gcd(final int n1, final int n2) {
        /**
         * {to the gcd of the given two numbers
         * bvy increasing the numbers which can divide both
         * the given numbers}.
         */
        int result = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
            }
        }
        return result;
    }
    /**
     * {prints the gcd of two numbers}.
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {
        /**
         * {reads input from user}.
         */

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /**
    *Need to write the gcd function and print the output.
    */
}



