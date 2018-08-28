import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Do not modify this main function.
    */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * { function_description }.
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     { description_of_the_return_value }
     */

    static long power(final int base, final int exponent) {
        /**
         * { var_description }.
         */
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);

    }
    /*
    Need to write the power function and print the output.
    */
}


