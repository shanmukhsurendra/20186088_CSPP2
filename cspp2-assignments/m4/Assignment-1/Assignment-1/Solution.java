/**
 * { item_description }
 */
import java.util.*;
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
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		/**
		 * { var_description }.
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
