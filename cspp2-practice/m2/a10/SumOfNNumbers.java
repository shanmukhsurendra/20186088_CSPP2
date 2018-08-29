import java.util.Scanner;
class SumOfNNumbers
{
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int a =0;
		while(i<=n)
		{
			a = a + i;
			System.out.println(a);
			i = i + 1;
		}
	
	}
}