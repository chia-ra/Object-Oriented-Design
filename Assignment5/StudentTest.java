public class StudentTest {
    /*
 method you should create an instance of Student with the following
information: John Smith, 20 year old, 3.6 gpa, Computer Science major, School of Computer
Science department. This student will also be taking 4 courses, which you specified in the
definition of the Student class. Create another instance of Student class, which should be a clone
of the first student. Use
printInfo()
 method call to print the values of both instances of Student.
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setLastName("Smith");
        student1.setAge(20);
        student1.setGPA(3.6);
        student1.setMajor("Computer Science");
        student1.setDepartment("School of Computer Science");

        Student student2 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");

        student1.printInfo();
        student2.printInfo();
    }
}
