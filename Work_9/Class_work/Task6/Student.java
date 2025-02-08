public class Student {
	protected String firstName;
	protected String lastName;
	protected String group;
	protected double averageMark;


	public Student(String firstName,String lastName, String group, double averageMark, double Scholarship){
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.averageMark = averageMark;
	}

	public double getScholarship() {
		if (averageMark != 5) {
			return 1900;
		}
		return 2000;
	}
}
