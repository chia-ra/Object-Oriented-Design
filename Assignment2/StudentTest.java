
public class StudentTest {

	public static void main(String[] args) {
		String name1= "John";
		String name2= "Smith";
		Student student1 = new Student(name1, name2);
		student1.setAge(20);
		student1.setGPA(3.6);
		student1.setMajor("Computer Science");
		student1.setDepartment("School of Computer Science");
		//created a new student and assigned their attributes
		Student.Course course = student1.new Course();
		course.printSchedule();
		//printing the schedule by accessing the course inner class of student
		
	}

}
