import java.util.Scanner;
/**
assignment-1.
*/
public final class Solution {
    /**
    *to print roll number and name.
    */
    private Solution() {
        //hgdh.
    }
    /**
     *@param args of type string[].
     */
    public static void main(final String[] args) {
        /**reads the input from the user.
        */
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int rollnumber = in.nextInt();
        System.out.println("Name :" + name + " Roll Number : " + rollnumber);
    }
}
