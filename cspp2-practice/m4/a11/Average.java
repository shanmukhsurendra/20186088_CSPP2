import java.util.Scanner;
/**
 * Class for average.
 */
public class  Average {
	/**
	 * Constructs the object.
	 */
	private  Average() {
		/**
		 * { item_description }.
		 */

	}
	/**
	 * { main function to print average }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**
		 * { main cloass to read the input into array }.
		 */
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int sum = 0;
		int[] array = new int[size];
		for (int i=0;i<size;i++){
			array[i] = s.nextInt();
			sum += array[i];
		}
		System.out.println(sum/size);
		
	}
}