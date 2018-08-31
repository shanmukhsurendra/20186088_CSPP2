/**
 * { item_description }
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Fill this main function to print maximum of given array.
    */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * {reads thge input from user using 
     * scanner }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * {returns the maximum value by comparing with
         * the remaining elements in array}.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        temp = a[0];
        for (int j = 0; j < n; j++) {
            if (temp < a[j]) {
                temp = a[j];
            }
        }
        System.out.println(temp);



    }
}


