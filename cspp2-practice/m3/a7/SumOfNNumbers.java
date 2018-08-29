import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
class SumOfNNumbers
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
		int i = 1;
		int a =0;
		while(i<=n)
		{
			a = a + i;
			
			i = i + 1;
		}
		System.out.println(a);
	
	}
}