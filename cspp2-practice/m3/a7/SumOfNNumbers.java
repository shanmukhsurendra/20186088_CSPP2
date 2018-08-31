import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
class SumOfNNumbers
{
	/**
	 * { to print sum of numbers upto given
	 * range}.
	 *
	 * @param      args  The arguments
	 */
	public static void main (String[] args) 
	{
		/**
		 * { to sum numbers by increasing one value at once}.
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