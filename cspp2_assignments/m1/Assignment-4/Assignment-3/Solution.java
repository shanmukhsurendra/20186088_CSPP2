import java.util.Scanner;
/**
degreecelcius.
*/
public final class Solution {
    /**
    *Do not modify this main function.
    */
    private Solution() {
        //hgdh.
    }
    /**
     *@param args of type string[].
     */
    public static void main(final String[] args) {
        /**
         *main fucntion
         */
        Scanner scan = new Scanner(System.in);
        double degreesCelsius = scan.nextDouble();
        degreesCelsius = ((9 * degreesCelsius) / 5) + 32;
        System.out.println(degreesCelsius);
    }
    /*
    Need to fill the calculateFromDegreesToFarenheit function
    and print the output
    of fahrenheit.
    */
}
