import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1srowa = sc.nextInt();
		int a1colms = sc.nextInt();
		int[][] a1 = new int[a1srowa][a1colms];
		for (int i = 0; i < a1srowa; i++) {
			for (int j = 0; j < a1colms; j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		int a2srowa = sc.nextInt();
		int a2colms = sc.nextInt();
		int[][] a2 = new int[a2srowa][a2colms];
		for (int i = 0; i < a2srowa; i++) {
			for (int j = 0; j < a2colms; j++) {
				a2[i][j] = sc.nextInt();
			}
		}
		int[][] sum = new int[a1srowa][a1colms];
		if (a1.length == a2.length) {
			for (int x = 0; x < a1srowa; x++) {
				for (int y = 0; y < a1colms; y++) {
					sum[x][y] = a1[x][y] + a2[x][y];
				}
			}
			for (int[] row : sum) {
				for (int column : row) {
					System.out.print(column + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("not possible");
		}
	}
}