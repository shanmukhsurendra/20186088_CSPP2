/**
 * { item_description }.
 */
import java.util.Scanner;
/**
    Do not modify this main function.
    */
public final class Solution {
    /** Fill the main function to print the number of 7's between 1 to n.
     */
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int sev = 7;
        int ten = 10;
        for (int i = sev; i <= n; i++) {
            int y = i;
            while (y > 0) {
                int x = y % 10;
                if (x == sev) {
                    count = count + 1;
                }
                y = y / ten;
            }


        }
        System.out.println(count);



    }
}