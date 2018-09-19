import java.util.Scanner;
import java.util.ArrayList;
class Client {
	public static void main(String[] args) {

		Fitbyte fit = new Fitbyte();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String inp = sc.nextLine();
			String[] inp1 = inp.split(" ");
			switch (inp1[0]) {
			case "food":
				//String[] inp2 = inp1[1].split(",");
				fit.foodLog(inp1[1]);//,inp2[1],inp2[2]);
				break;
			case "water":
				//String[] inp2 = inp1[1].split(",");
				fit.waterLog(inp1[1]);//,inp2[1],inp2[2]);
				break;
			case "activity":
				//String[] inp2 = inp1[1].split(",");
				fit.activityLog(inp1[1]);//,inp2[1],inp2[2],inp2[3],inp2[4]);
				break;
			case "sleep":
				//String[] inp2 = inp1[1].split(",");
				fit.sleeping(inp1[1]);//,inp2[1]);
				break;
			case "weight":
				//String[] inp2 = inp1[1].split(",");
				fit.weightLog(inp1[1]);//,inp2[1],inp2[2]);
				break;
			case "summary":
				fit.summary();
				break;
			default:
				break;
			}
		}

	}
}