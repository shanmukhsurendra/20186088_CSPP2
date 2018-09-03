class Student {
	/**
	 * 
	 * studentName is a string. 
	 */
	private String studentName;
	/**
	 * roll no as a string.
	 */
	private String rollNo;
	/**
	 * sub1 marks a double variable.
	 */
	private double sub1;
	/**
	 * sub2 marks a double variable.
	 */
	private double sub2;
	/**
	 * sub3 marks a double variable.
	 */
	private double sub3;
	/**
	 * Constructs the object.
	 *
	 * @param      studentName  The student name
	 * @param      rollNo       The roll no
	 * @param      sub1         The sub 1
	 * @param      sub2         The sub 2
	 * @param      sub3         The sub 3
	 */
	public Student(String studentName, String rollNo, double sub1, double sub2 , double sub3 ) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	/**
	 * calculates the average of three subject marks.
	 *
	 * @return     returns the average value.
	 */
	public double GPA() {
		/**
		 * 3 is assigned to int three variable.
		 */
		final int three = 3;
		final int ten = 10;
		double average =(sub1 + sub2 + sub3) / 3;
		return (Math.floor(average*10))/10;
	}
	/**
	 * reads the input from the user.
	 * @param args takes the input.
	 */
	public static void main(String args[]) {
		Student s1 = new Student("shanmukh", "13NE1A0530", 7.5, 7.0, 8.0);
		System.out.println(s1.GPA());
		Student s2 = new Student("surendra", "13NE1A0527", 8.5, 6.0, 7.5);
		System.out.println(s2.GPA());
		Student s3 = new Student("Akshay", "13NE1A0532", 7.5, 8.0, 9.0);
		System.out.println(s3.GPA());
	}
}