public final class Areaof {
	/**
	 * { function_description }
	 *
	 * @param      r     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
   public static double area(int r)
   {
   	/**
   	 * { var_description }
   	 */
	  double pii = pi();
	  return pii * r * r;
   }
   public static double pi()
   {
   	/**
   	 * { item_description }
   	 */
	  return 3.14;
   }
   /**
    * { item_description }
    */
   public final static void main(final String args[]) {
   	/**
   	 * { var_description }
   	 */
	  Areaof a = new Areaof();
	  double ar = a.area(15);
	  System.out.println(ar);
   }
}