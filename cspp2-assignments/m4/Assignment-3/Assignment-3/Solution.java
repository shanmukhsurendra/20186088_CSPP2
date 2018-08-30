/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * { function_description }.
     *
     * @param      s     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    static long binaryToDecimal(final String s) {
        /**
         * { var_description }.
         */
        long i = (long)Long.parseLong(s);
        int b = 1;
        final int ten = 10;
        long sum = 0;
        long y = i;
        while (y > 0) {
            long x = y % ten;
            sum += x * Math.pow(2, b - 1);
            y = y / ten;
            b = b + 1;
        }
        return sum;
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            long res = binaryToDecimal(s);
            System.out.println(res);
        }
    }

}
