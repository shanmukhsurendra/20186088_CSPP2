import java.io.*;
import java.util.*;
import java.lang.*;
class Count {
	long bagOFWords(String one, String two) {
		HashMap<String, Integer> df1 = new HashMap<>();
		HashMap<String, Integer> df2 = new HashMap<>();
		String[] arr1 = one.split(" ");
		String[] arr2 = two.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			if (df1.containsKey(arr1[i])) {
				int sample = df1.get(arr1[i]);
				sample += 1;
				df1.put(arr1[i], sample);
			} else {
				df1.put(arr1[i], 1);
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			if (df2.containsKey(arr2[j])) {
				int sample = df2.get(arr2[j]);
				sample += 1;
				df2.put(arr2[j], sample);
			} else {
				df2.put(arr2[j], 1);
			}
		}
		eucledianNorm(df1);
		eucledianNorm(df2);
		dotProduct(df1, df2);
		double ouput;
		ouput = dotProduct(df1, df2) / (eucledianNorm(df1) * eucledianNorm(df2));
		return Math.round(ouput*100);

	}
	double eucledianNorm(HashMap ash) {
		double valy;
		List<Integer> list1 = new ArrayList<Integer>();
		for (Object key : ash.keySet()) {
			list1.add((Integer)ash.get(key));
		}
		Integer[] arra = list1.toArray(new Integer[list1.size()]);
		int no = 0;
		for (int e : arra) {
			no += Math.pow(e, 2);
		
		}
		valy = Math.sqrt(no);
		return valy;
	}
	int dotProduct(HashMap ash1, HashMap ash2) {
		int dot = 0;
		for (Object key1 : ash1.keySet()) {
			for (Object key2 : ash2.keySet()) {
				if (key1.equals(key2)) {
					dot += (Integer)ash1.get(key1) * (Integer)ash2.get(key1);
				}
			}
		}
		return dot;
	}


}
class Solution {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String folder = s.nextLine();
		
		File file = new File("F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\" + folder);
		String[] file3 = file.list();
		if(file3.length == 0){
			System.out.println("empty directory");
		}else{
		Arrays.sort(file3);
			System.out.print("      ");
			System.out.print("	");
			System.out.print("\t");
		for (int c = 0; c < file3.length-1; c++) {
			System.out.print(file3[c]+"\t");
		}
		System.out.println(file3[file3.length-1]+"\t");
		long[][] result = new long[file3.length][file3.length];
		for (int a = 0; a < file3.length; a++) {
			System.out.print(file3[a]+"\t");
			for (int b = 0; b < file3.length; b++) {
				File file1 = new File("F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\"+folder+"\\"+file3[a]);
				File file2 = new File("F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\"+folder+"\\"+file3[b]);
				BufferedReader br1 = new BufferedReader(new FileReader(file1));
				BufferedReader br2 = new BufferedReader(new FileReader(file2));
				String line1;
				String line2;
				String inp1 = "";
				String inp2 = "";
				Count cu = new Count();
				while ((line1 = br1.readLine()) != null) {
					line1 = line1.toLowerCase();
					inp1 = inp1 + line1.replaceAll("[0-9_ ]", " ").replaceAll("\\s+", " ");
				}
				while ((line2 = br2.readLine()) != null) {
					line2 = line2.toLowerCase();
					inp2 = inp2 + line2.replaceAll("[0-9_ ]", " ").replaceAll("\\s+", " ");
				}
				//System.out.println("call3");
				long ot = cu.bagOFWords(inp1, inp2);
				result[a][b] = ot;
				System.out.print(ot);
				System.out.print("	"+"\t");
			}
			System.out.println();
				
		}
		long max = result[0][1];
		String index[] = new String[2];
		index[0] = file3[0];
		index[1] = file3[0];
		for (int d=0;d<file3.length;d++) {
			for (int e =0;e<file3.length;e++) {
				if(result[d][e] > max && d!=e){
					max = result[d][e];
					index[0] = file3[d];
					index[1] = file3[e];
				}
				
			}
			
		}
		System.out.print("Maximum similarity is between "+index[0]+" and "+index[1]);
	}

	}
}