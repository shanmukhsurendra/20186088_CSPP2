/**
* Write a class called InputValidator to validate the given input.
*/
import java.util.Scanner;
/**
* Class for input validator.
*/
class InputValidator {
    /**
     * taking data a string variable.
     * length is of int data variable.
     */
    private String data;
    private int length;
    /**
     * Constructs the object.
     *
     * @param      input  takes input string as parameters. 
     */
    public InputValidator(final String input) {
        /**
         * data is used to take input.
         * length is used to calculate length of data.
         */
        data = input;
        length = data.length();
    }
    /**
     * checks the length.
     *
     * @return     returns true if length is >6 or else false.
     */
    public boolean validateData() {
        /**
         * assigning the 6 to six and comparing with length.
         */
        final int six = 6;
        if (length < six) {
            return false;
        }
        return true;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * calls the class inlutvalidator.
     */
    private Solution() {
        /**
         * empty constructor.
         */
    }
    /**
     * main function where the programm starts the execution.
     */
    public static void main(final String args[]) {
        /**
         * input s is taken using the scanner function.
         */
        Scanner s =   new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}