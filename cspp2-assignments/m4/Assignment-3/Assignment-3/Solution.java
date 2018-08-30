
// Given an String, Write a java method that returns the decimal value for the given binary string.
import java.lang.Math;
import java.util.Scanner;
public class Solution {
	/*
	Do not modify this main function.
	*/
	static long binaryToDecimal(String s) {
		long i = (long)Long.parseLong(s);
		int b = 1;
		final int ten = 10;
		long sum = 0;
		long y = i;
		while (y > 0) {
			long x = y % ten;
			sum += x * Math.pow(2, b);
			y = y / ten;
			b = b + 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			long res = binaryToDecimal(s); //Write binaryToDecimal function
			System.out.println(res);
		}
	}

}



