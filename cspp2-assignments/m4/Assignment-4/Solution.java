
// Given an String, Write a java method that returns
//the decimal value for the given binary string.


import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Do not modify the main function.
    */
    private Solution() {
        /**
         * { item_description}.
         */
    }
    /**
     * {reading the input from the main fucntion}.
     *
     * @param      s     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    public static String reverseString(final String s) {
        /**
         *{using for loop adding the charcters of
         *given to other empty string from the backwards}.
         */
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    /**
     * {returns the reverse string by calling the
     * method}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * {reads the string from the user}.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function

}
