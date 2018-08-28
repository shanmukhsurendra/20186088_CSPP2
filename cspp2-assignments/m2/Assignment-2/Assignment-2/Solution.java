import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Do not modify this main function.
    */
    private Solution() {
        //dg.
    }
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    static void quadraticEquation(final int a, final int b, final int c) {
        /**
         * { var_description }.
         */
        final int four = 4;
        double determinent = b * b - four * a * c;
        double root1 = (-b + Math.sqrt(determinent)) / (2 * a);
        double root2 = (-b - Math.sqrt(determinent)) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
    /**
     * { function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * main function.
         */
        Scanner scan = new Scanner(System.in);
        final int four = 4;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        quadraticEquation(a, b, c);

    }
}
/**
*Need to write the rootsOfQuadraticEquation function and print the output.
*/
