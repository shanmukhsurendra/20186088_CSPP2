import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
class Pattern
{
	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main (String[] args) 
	{
		/**
		 * { var_description }.
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for (i = 1;i <=n;i++ ) {
			for (j=1;j<=i;j++ ) {
				System.out.print(j);
				
			}
				System.out.println("");
			
		}
	
	}
}