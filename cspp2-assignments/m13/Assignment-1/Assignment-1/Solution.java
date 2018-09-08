import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Class for set.
 * @author :
 */
class Set {
	//your code goes here...
	//Good luck :-)
	private int[] set;
	private int size;
	public Set() {
	Set set = new Set();
		int size = 0;
	}
	public int size() {
		return size;
	}
	public boolean contains(final int item) {
		for (int i = 0; i < size; i++) {
			if (item == set[i]) {
				return true;
			}
		}
		return false;
	}
	public String toString() {

		if (size == 0) {
			return "{}";
		} else {
			String str = "{";
			int i = 0;
			for (i = 0; i < size - 1; i++) {
				str = str + set[i] + ",";
			}
			str = str + set[i] + "}";
			return str;
		}

	}
	public void resize() {
		set = Arrays.copyOf(set, set.length * 2);
	}
	public void add(int item) {
		if (size == set.length) {
			resize();
		}
		if (size == 0) {
			set[size]=item;
		} else {
			if (contains(item)) {

			} else {
				set[size]=item;
				size++;
			}
		}
	}

	public void add(final int[] newSet) {
		if (size == set.length) {
			resize();
		}
		for (int i = 0; i < newSet.length; i++) {
			if (contains(newSet[i])) {

			} else {
				set[size]=newSet[i];
				size++;
			}
		}
	}
	/*public Set intersection(Set newSett) {
		Set set2 = new Set();
		int k = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j <newSett.length; j++) {
				if (newSett[j] == set[i]) {
					set2[k]=set[i];
					k++;
				}
			}
		}
		return set2.toString();

	}
	/*public Set retainAll(int[] array){

		

	}
	public int[][] cartesianProduct(Set arraySet){
		return ;

	}*/




















}
/**
 * Solution class for code-eval.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * helper function to convert string input to int array.
	 *
	 * @param      s     { string input from test case file }
	 *
	 * @return     { int array from the given string }
	 */
	public static int[] intArray(final String s) {
		String input = s;
		if (input.equals("[]")) {
			return new int[0];
		}
		if (s.contains("[")) {
			input = s.substring(1, s.length() - 1);
		}
		return Arrays.stream(input.split(","))
		       .mapToInt(Integer::parseInt)
		       .toArray();
	}
	/**
	 * main function to execute test cases.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		// instantiate this set
		Set s = new Set();
		// code to read the test cases input file
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		// check if there is one more line to process
		while (stdin.hasNext()) {
			// read the line
			String line = stdin.nextLine();
			// split the line using space
			String[] tokens = line.split(" ");
			// based on the list operation invoke the corresponding method
			switch (tokens[0]) {
			case "size":
				System.out.println(s.size());
				break;
			case "contains":
				System.out.println(s.contains(Integer.parseInt(tokens[1])));
				break;
			case "print":
				System.out.println(s);
				break;
			case "add":
				int[] intArray = intArray(tokens[1]);
				if (intArray.length == 1) {
					s.add(intArray[0]);
				} else {
					s.add(intArray);
				}
				break;
			/*case "intersection":
			s = new Set();
			Set t = new Set();
			intArray = intArray(tokens[1]);
			s.add(intArray);
			intArray = intArray(tokens[2]);
			t.add(intArray);
			System.out.println(s.intersection(t));
			break;*/
			/*case "retainAll":
			s = new Set();
			intArray = intArray(tokens[1]);
			s.add(intArray);
			intArray = intArray(tokens[2]);
			System.out.println(s.retainAll(intArray));
			break;
			case "cartesianProduct":
			s = new Set();
			t = new Set();
			intArray = intArray(tokens[1]);
			s.add(intArray);
			intArray = intArray(tokens[2]);
			t.add(intArray);
			System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
			break;*/
			default:
				break;
			}
		}
	}
}
