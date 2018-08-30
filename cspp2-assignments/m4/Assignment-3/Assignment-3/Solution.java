/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * import scanner class.
 */
public final class Solution {
    /**
     * class.
     */
    private Solution() {
        //ergdsfg.
    }
    /**
     * { function_description }.
     *
     * @param      s     { parameter_description }.
     *
     * @return     { binary to decimal}.
     */
    static long binaryToDecimal(final String s) {
        /**
         * here we consider each digit of
         * gievn number and multiply with 2
         * by power .
         */
        long i = (long) Long.parseLong(s);
        int b = 0;
        final int ten = 10;
        long sum = 0;
        long y = i;
        while (y > 0) {
            long x = y % ten;
            sum += x * Math.pow(2, b);
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
         * main fucntion to read the input and
         * print result by recuersion.
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
