/**
 * {program to print sum of n numbers}.
 */
import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
public class SumOfNNumbers {
	/**
	 * Constructs the object.
	 */
	private SumOfNNumbers() {
		/**
		 * { item_description }
		 */
	}
	/**
	 * {main function to read the input}.
	 *
	 * @param      args  The arguments
	 */
	public static void main (String[] args) {
		/**
		 * {adding numbers upto n range}.
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int a = 0;
		while (i <= n) {
			a = a + i;
			i = i + 1;
		}
		System.out.println(a);

	}
}