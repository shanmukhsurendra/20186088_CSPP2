import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	static void baseExpo(final int base, final int exponent) {
		/**
		 * { var_description }.
		 */
		if (exponent == 0) {
			System.out.println(1);
		}
		if (exponent > 1) {
		base = base * base;
		baseExpo(base, exponent - 1);
	}
		else {
			System.out.println(base);
		}

		

	}
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int exponent = s.nextInt();
		baseExpo(base, exponent);
		
	}
	/*
	Need to write the power function and print the output.
	*/
}
