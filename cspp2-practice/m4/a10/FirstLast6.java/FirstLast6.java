/**
 * { item_description }
 */
import java.util.Scanner;
public class FirstLast6 {
	/**
	 * Constructs the object.
	 */
	private FirstLast6() {
		/**
		 * { item_description }
		 */

	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**
		 * { var_description }
		 */
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		if (array[0] == 6 || array[size] == 6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}