import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Concatinate {
	/**
	*Do not modify the main function.
	*/
	private Concatinate() {
		/**
		 * { item_description}.
		 */
	}
	/**
	 * {reading the input from the main fucntion}.
	 *
	 * @param      s     { parameter_description }.
	 *
	 * @return     { returns the concatinated string }.
	 */
	public static String helloname(final String s) {
		/**
		 *{appending two strings using +
		 *concatinate operator}.
		 */
		return "Hello " + s + "!";
	}
	/**
	 * {returns the returns the concatinated string}.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		/**
		 * {reads the string from the user}.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = helloname(s);
		System.out.println(reverse);
	}
	//Write reverseString function

}
