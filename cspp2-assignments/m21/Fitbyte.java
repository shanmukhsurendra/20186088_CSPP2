import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class for fitbyte.
 */
class Fitbyte {
	/**
	 * array lists variables are declared here.
	 */
	private ArrayList<String> food;
	private ArrayList<String> water;
	private ArrayList<String> activity;
	private ArrayList<String> sleep;
	private ArrayList<String> weight;
	/**
	 * Constructs the object.
	 */
	Fitbyte() {
		/**
		 * array list variables are intialised here.
		 */
		food = new ArrayList<>();
		water = new ArrayList<>();
		activity = new ArrayList<>();
		sleep = new ArrayList<>();
		weight = new ArrayList<>();
	}
	/**
	 * add the items to be added into food arraylist.
	 *
	 * @param      items  items are perameters to add into food list.
	 */
	void foodLog(Food items) {
		food.add(items);

	}
	/**
	 * add the items to be added into water arraylist.
	 *
	 * @param      items  The items
	 */
	void waterLog(String items) {
		water.add(items);
	}
	/**
	 * add the items to be added into activity arraylist.
	 *
	 * @param      items  The items
	 */
	void activityLog(String items) {
		activity.add(items);
	}
	/**
	 * add the items to be added into sleep arraylist.
	 *
	 * @param      items  The items
	 */
	void sleeping(String items) {
		sleep.add(items);
	}
	/**
	 * add the items to be added into weight arraylist.
	 *
	 * @param      items  The items
	 */
	void weightLog(String items) {
		weight.add(items);
	}
	/**
	 * when summary is called all the items in all the lists in particular
	 * date is printed.
	 *
	 * @param      date  The date
	 */
	void summary(String date) {
		String summa = "";
		int i;
		for (i = 0; i < food.size(); i++) {
			String[] inp2 = food.get(i).split(",");
			//System.out.println(inp2[0]);
			//System.out.println(date);
			if (inp2[0].equals(date)) {
				summa += "Food: "+food.get(i) + "#";
			}
		}
		for (i = 0; i < water.size(); i++) {
			String[] inp2 = water.get(i).split(",");
			//System.out.println(inp2[0]);
			if (inp2[0].equals(date)) {
				summa += "Water: "+water.get(i) + "#";
			}
		}
		for (i = 0; i < activity.size(); i++) {
			String[] inp2 = activity.get(i).split(",");
			if (inp2[0].equals(date)) {
				summa += "Activity: "+activity.get(i) + "#";
			}
		}
		for (i = 0; i < sleep.size(); i++) {
			String[] inp2 = sleep.get(i).split(",");
			if (inp2[0] == date) {
				summa += "Sleep: "+sleep.get(i) + "#";
			}
		}
		for (i = 0; i < weight.size(); i++) {
			String[] inp2 = weight.get(i).split(",");
			if (inp2[0] == date) {
				summa += "Weight: "+weight.get(i) + "#";
			}
		}

		String[] outpt = summa.split("#");
		//System.out.println(Arrays.toString(outpt));
		for (i = 0; i < outpt.length; i++) {
			System.out.println(outpt[i]);
		}

	}
}
