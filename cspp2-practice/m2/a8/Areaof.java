public final class Areaof {
   /**
    * Constructs the object.
    */
   private Areaof() {
      /**
       * { item_description }.
       */
   }
	/**
	 * { function_description }.
	 *
	 * @param      r     { parameter_description }.
	 *
	 * @return     { description_of_the_return_value }.
	 */
   public static double area(int r)
   {
   	/**
   	 * {returns the area of circle}.
   	 */
	  double pii = pi();
	  return pii * r * r;
   }
   public static double pi()
   {
   	/**
   	 * { gives the pie value}.
   	 */
	  return 3.14;
   }
   /**
    * { item_description }.
    */
   public final static void main(final String args[]) {
   	/**
   	 * {print the required by calling methods}.
   	 */
	  Areaof a = new Areaof();
	  double ar = a.area(15);
	  System.out.println(ar);
   }
}