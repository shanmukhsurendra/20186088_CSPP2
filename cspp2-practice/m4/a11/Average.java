import java.util.Scanner;
public class  Average {
	private  Average() {

	}
	public static void main(String[] args) {
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