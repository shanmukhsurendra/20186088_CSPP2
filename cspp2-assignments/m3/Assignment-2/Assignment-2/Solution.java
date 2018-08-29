/**
 * { item_description }
 */
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
	/* Fill the main function to print the number of 7's between 1 to n*/
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i = 7; i <= n; i++) {
			int y=i;
			while (y > 0) {
				int x = y % 10;
				if (x == 7) {
					count = count + 1;
				}
				y = y / 10;
			}


		}
		System.out.println(count);



	}
}