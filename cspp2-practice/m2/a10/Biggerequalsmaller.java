import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Biggerequalsmaller {
    /**
     * Constructs the object.
     */
    private Biggerequalsmaller() {
        //fz.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        int varA = s.nextInt();
        int varB = s.nextInt();
        if (varA > varB) {
            System.out.println("Bigger");

        } else if (varA == varB) {
            System.out.println("Equal");

        } else {
            System.out.println("Smaller");
        }
    }
}