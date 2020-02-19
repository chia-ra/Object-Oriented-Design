
public class Student {

	private String firstName;
	private String lastName;
	private String major;
	private String department;
	private int age;
	private double GPA;
	
	Student(String first, String last) {
		//constructor
		this.firstName = first;
		this.lastName = last;
	}
	
	//getters and setters for each variable 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String maj) {
		major = maj;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String dept) {
		department = dept;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int num) {
		age = num;
	}
	
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gpa) {
		GPA = gpa;
	}
	
	class Course {
		//inner class with which to print the schedule
		public void printSchedule() {
			System.out.println("Course Schedule: MATH161A, CS166, CS151, CS147, PHIL134");
		}
	}


}
