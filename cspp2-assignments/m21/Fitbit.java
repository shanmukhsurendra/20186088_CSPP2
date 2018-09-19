import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class Fitbit {
	public ArrayList<Food> food;
	public ArrayList<Water> water;
	public ArrayList<Activity> activity;
	public ArrayList<Sleep> sleep;
	public ArrayList<Weight> weight;
	Fitbit() {
		/**
		 * array list variables are intialised here.
		 */
		food = new ArrayList<>();
		water = new ArrayList<>();
		activity = new ArrayList<>();
		sleep = new ArrayList<>();
		weight = new ArrayList<>();
	}
	public void food1(Food items) {
		food.add(items);
	}
	/**
	* add the items to be added into water arraylist.
	*
	* @param      items  The items
	*/
	void water1(Water items) {
		//System.out.println(water.toString());
		water.add(items);
	}
	/**
	 * add the items to be added into activity arraylist.
	 *
	 * @param      items  The items
	 */
	void activity1(Activity items) {
		activity.add(items);
	}
	/**
	 * add the items to be added into sleep arraylist.
	 *
	 * @param      items  The items
	 */
	void sleeping1(Sleep items) {
		sleep.add(items);
	}
	/**
	 * add the items to be added into weight arraylist.
	 *
	 * @param      items  The items
	 */
	void weight1(Weight items) {
		weight.add(items);
	}
	/**
	 * when summary is called all the items in all the lists in particular
	 * date is printed.
	 *
	 * @param      date  The date
	 */
	void summary() {
		String str = "";
		String summa = "";
		int i;
		for (i = 0; i < food.size(); i++) {
			str = "" + food.get(i);
			String[] inp2 = str.split(",");
			//System.out.println(inp2[0]);
			//System.out.println(date);
			//if (inp2[0].equals(date)) {
			summa += "Food: " + "\n" + food.get(i) + "#";
			//}
		}
		for (i = 0; i < water.size(); i++) {
			str = "" + water.get(i);
			String[] inp2 = str.split(",");
			//System.out.println(inp2[0]);
			//if (inp2[0].equals(date)) {
			summa += "Water: " + water.get(i) + "#";
			//}
		}
		for (i = 0; i < activity.size(); i++) {
			str = "" + activity.get(i);
			String[] inp2 = str.split(",");
			//if (inp2[0].equals(date)) {
			summa += "Activity: " + activity.get(i) + "#";
			//}
		}
		for (i = 0; i < sleep.size(); i++) {
			str = "" + sleep.get(i);
			String[] inp2 = str.split(",");
			//if (inp2[0] == date) {
			summa += "Sleep: " + sleep.get(i) + "#";
			//}
		}
		for (i = 0; i < weight.size(); i++) {
			str = "" + weight.get(i);
			String[] inp2 = str.split(",");
			//if (inp2[0] == date) {
			summa += "Weight: " + weight.get(i) + "#";
			//}
		}

		String[] outpt = summa.split("#");
		//System.out.println(Arrays.toString(outpt));
		for (i = 0; i < outpt.length; i++) {
			System.out.println(outpt[i]);
		}

	}
}