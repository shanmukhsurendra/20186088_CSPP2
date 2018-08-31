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
		 * { item_description }''
		 */

	}
	/**
	 * { to check given condition }.
	 */
	public static boolean firstlast6(int[] arra) {
		/**
		 * { item_description }.
		 */
		if (arra[0] == 6 || arra[arra.length-1] == 6) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * { to read inputs into array }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**
		 * { int variables are taken and 
		 * read into array }.
		 */
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		System.out.println(firstlast6(array));
		
	}
}