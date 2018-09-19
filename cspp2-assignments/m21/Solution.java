import java.util.Scanner;
import java.util.*;
class Water {
	private String quantity;
	private String date;
	private String time;

	Water(String quantity, String date, String time) {
		this.quantity = quantity;
		this.date = date;
		this.time = time;

	}
	Water() {

	}
	public String getQuantity() {
		return quantity;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public String toString() {
		//System.out.println("Water");
		String out = getDate() + "," + getQuantity();
		return out;
	}
}
class Food {
	private String foodName;
	private String quantity;
	private String date;
	private String time;

	Food(String foodName, String quantity, String date, String time) {
		this.foodName = foodName;
		this.quantity = quantity;
		this.date = date;
		this.time = time;

	}
	Food() {

	}
	/*public String toString() {
	    // return foodName + " " + foodQuntity + " " + foodDate + " " + foodtime;
	    return "Food Consumed :" + foodName + "\nQuantity : " + quantity  + " at " + time;
	}*/
	Fitbit fit1 = new Fitbit();
	public String getFoodName() {
		return foodName;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public String toString() {
		String out = getDate() + "," + getTime() + "," + getFoodName() + "," + getQuantity();
		return out;
	}



}
class Activity {
	private String activityName;
	private String notes;
	private String date;
	private String startime;
	private String endTime;

	Activity(String activityName, String notes,  String date, String startime, String endTime) {
		this.activityName = activityName;
		this.notes = notes;
		this.date = date;
		this.startime = startime;
		this.endTime = endTime;

	}
	Activity() {

	}
	public String getActivityName() {
		return activityName;
	}
	public String getNotes() {
		return notes;
	}
	public String getDate() {
		return date;
	}
	public String getStarTime() {
		return startime;
	}
	public String getEndTime() {
		return endTime;
	}
	public String toString() {
		String out = getActivityName() + "," + getNotes() + "," + getDate() + ","
		             + getStarTime() + "," + getEndTime();
		return out;
	}
}
class Weight {
	private String weight;
	private String fat;
	private String date;
	private String time;

	Weight(String weight, String fat, String date, String time) {
		this.weight = weight;
		this.fat = fat;
		this.date = date;
		this.time = time;

	}
	Weight() {

	}
	public String getWeight() {
		return weight;
	}
	public String getFat() {
		return fat;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public String toString() {
		String out = getDate() + "," + getTime() + "," + getWeight() + "," + getFat();
		return out;
	}
}
class Sleep {
	private String starTime;
	private String date;
	private String endTime;

	Sleep(String starTime, String date, String endTime) {
		this.starTime = starTime;
		this.date = date;
		this.endTime = endTime;

	}
	Sleep() {

	}
	public String getStarTime() {
		return starTime;
	}
	public String getDate() {
		return date;
	}
	public String getEndTime() {
		return endTime;
	}
	public String toString() {
		String out = getDate() + "," + getStarTime()
		             + "," + getEndTime();
		return out;
	}
}
class Solution {
	Solution() {

	}
	// public void foodLog(){
	// 	Fitbit fit = new Fitbit();
	// 	System.out.println("Food");
	// 	//System.out.println(fit.food.size());
	// 			for(int k = 0;k<fit.food.size();k++){
	// 				String str1 = "";
	// 				str1 = ""+fit.food.get(k);
	// 				String[] input2 = str1.split(",");
	// 	System.out.println("Date:"+input2[2]+"\n"+"Time:"+input2[1]+"\n"+"Name:"
	// 	+input2[0]+"\n"+"Quantity:"+input2[3]);
	// 			}
	// 		}
	public static void main(String[] args) {
		Fitbit fit = new Fitbit();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String inp = sc.nextLine();
			String[] inp1 = inp.split(" ");
			switch (inp1[0]) {
			case "Food":
				String[] inp2 = inp1[1].split(",");
				fit.food1(new Food(inp2[0], inp2[1], inp2[2], inp2[3]));
				break;
			case "Water":
				String[] inp3 = inp1[1].split(",");
				fit.water1(new Water(inp3[0], inp3[1], inp3[2]));
				break;
			case "PhysicalActivity":
				String[] inp4 = inp1[1].split(",");
				fit.activity1(new Activity(inp4[0], inp4[1], inp4[2], inp4[3], inp4[4]));
				break;
			case "Sleep":
				String[] inp5 = inp1[1].split(",");
				fit.sleeping1(new Sleep(inp5[0], inp5[1], inp5[2]));
				break;
			case "Weight":
				String[] inp6 = inp1[1].split(",");
				fit.weight1(new Weight(inp6[0], inp6[1], inp6[2], inp6[3]));
				break;
			case "Summary":
				if (inp1.length == 1) {
					System.out.println("Food");
					for (int k = 0; k < fit.food.size(); k++) {
						String str1 = "";
						str1 = "" + fit.food.get(k);
						String[] input2 = str1.split(",");
						System.out.println("Date:" + input2[0] + "\n" + "Time:" + input2[1] + "\n" + "Name:"
						                   + input2[2] + "\n" + "Quantity:" + input2[3]);
					}
					System.out.println("Water");
					for (int k = 0; k < fit.water.size(); k++) {
						String str1 = "";
						str1 = "" + fit.water.get(k);
						String[] input2 = str1.split(",");
						System.out.println("Date:" + input2[0] + "\n" + "Quantity:" + input2[1]);
					}
					System.out.println("PhysicalActivity");
					for (int k = 0; k < fit.activity.size(); k++) {
						String str1 = "";
						str1 = "" + fit.activity.get(k);
						String[] input2 = str1.split(",");
						System.out.println("Name:" + input2[0] + "\n" + "Notes" + input2[1] + "\n" + "Date" + input2[2] + "\n" + "Starttime" + input2[3]
						                   + "\n" + "Endtime:" + input2[4]);
					}
					System.out.println("Weight");
					for (int k = 0; k < fit.weight.size(); k++) {
						String str1 = "";
						str1 = "" + fit.weight.get(k);
						String[] input2 = str1.split(",");
						System.out.println("Date" + input2[2] + "\n" + "Time:" + input2[3] + "\n"
						                   + "weight:" + input2[0] + "\n" + "Fat:" + input2[1]);
					}
					System.out.println("Sleep");
					for (int k = 0; k < fit.sleep.size(); k++) {
						String str1 = "";
						str1 = "" + fit.sleep.get(k);
						String[] input2 = str1.split(",");
						System.out.println("Date:" + input2[1] + "\n" + "Starttime:" + input2[2]
						                   + "\n" + "Endtime:" + input2[0]);
					}
				} else {
					Food fo = new Food();
					Water wa = new Water();
					Sleep sl = new Sleep();
					Weight we = new Weight();
					Activity ac = new Activity();
					System.out.println("Food");
					for (int k = 0; k < fit.food.size(); k++) {
						String str1 = "";
						str1 = "" + fit.food.get(k);
						String[] input2 = str1.split(",");
						if (input2[0].equals(inp1[1])) {
							System.out.println("Date:" + input2[0] + "\n" + "Time:" + input2[1] + "\n" + "Name:"
							                   + input2[2] + "\n" + "Quantity:" + input2[3]);
						}
					}
					System.out.println("Water");
					for (int k = 0; k < fit.water.size(); k++) {
						String str1 = "";
						str1 = "" + fit.water.get(k);
						String[] input2 = str1.split(",");
						if(input2[0].equals(inp1[1])){
						System.out.println("Date:" + input2[0] + "\n" + "Quantity:" + input2[1]);
					}
				}
					System.out.println("PhysicalActivity");
					for (int k = 0; k < fit.activity.size(); k++) {
						String str1 = "";
						str1 = "" + fit.activity.get(k);
						String[] input2 = str1.split(",");
						if(input2[2].equals(inp1[1])){
						System.out.println("Name:" + input2[0] + "\n" + "Notes" + input2[1] + "\n" + "Date" + input2[2] + "\n" + "Starttime" + input2[3]
						                   + "\n" + "Endtime:" + input2[4]);
					}
				}
					System.out.println("Weight");
					for (int k = 0; k < fit.weight.size(); k++) {
						String str1 = "";
						str1 = "" + fit.weight.get(k);
						String[] input2 = str1.split(",");
						if(input2[2].equals(inp1[1])){
						System.out.println("Date" + input2[2] + "\n" + "Time:" + input2[3] + "\n"
						                   + "weight:" + input2[0] + "\n" + "Fat:" + input2[1]);
					}
				}
					System.out.println("Sleep");
					for (int k = 0; k < fit.sleep.size(); k++) {
						String str1 = "";
						str1 = "" + fit.sleep.get(k);
						String[] input2 = str1.split(",");
						if(input2[2].equals(inp1[1])){
						System.out.println("Date:" + input2[1] + "\n" + "Starttime:" + input2[2]
						                   + "\n" + "Endtime:" + input2[0]);
					}
				}
			}
				break;
			case "Foodlog":
				// Solution sol = new Solution();
				// sol.foodLog();
				System.out.println("Food");
				for (int k = 0; k < fit.food.size(); k++) {
					String str1 = "";
					str1 = "" + fit.food.get(k);
					String[] input2 = str1.split(",");
					System.out.println("Date:" + input2[0] + "\n" + "Time:" + input2[1] + "\n" + "Name:"
					                   + input2[2] + "\n" + "Quantity:" + input2[3]);
				}
				break;
			case "Waterlog":
				System.out.println("Water");
				for (int k = 0; k < fit.water.size(); k++) {
					String str1 = "";
					str1 = "" + fit.water.get(k);
					String[] input2 = str1.split(",");
					System.out.println("Date:" + input2[0] + "\n" + "Quantity:" + input2[1]);
				}
				break;
			case "PhysicalActivitylog":
				System.out.println("PhysicalActivity");
				for (int k = 0; k < fit.activity.size(); k++) {
					String str1 = "";
					str1 = "" + fit.activity.get(k);
					String[] input2 = str1.split(",");
					System.out.println("Name:" + input2[0] + "\n" + "Notes" + input2[1] + "\n" + "Date" + input2[2] + "\n" + "Starttime" + input2[3]
					                   + "\n" + "Endtime:" + input2[4]);
				}
				break;
			case "Weightlog":
				System.out.println("Weight");
				for (int k = 0; k < fit.weight.size(); k++) {
					String str1 = "";
					str1 = "" + fit.weight.get(k);
					String[] input2 = str1.split(",");
					System.out.println("Date" + input2[2] + "\n" + "Time:" + input2[3] + "\n"
					                   + "weight:" + input2[0] + "\n" + "Fat:" + input2[1]);
				}
				break;
			case "Sleeplog":
				System.out.println("Sleep");
				for (int k = 0; k < fit.sleep.size(); k++) {
					String str1 = "";
					str1 = "" + fit.sleep.get(k);
					String[] input2 = str1.split(",");
					System.out.println("Date:" + input2[1] + "\n" + "Starttime:" + input2[2]
					                   + "\n" + "Endtime:" + input2[0]);
				}
				break;
			default:
				break;
			}
		}

	}
}