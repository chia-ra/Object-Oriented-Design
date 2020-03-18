public class Student {

    //variables and course instantiations
    private String firstName;
    private String lastName;
    private int age;
    private double GPA;
    private String major;
    private String department;
    private Course cs151;
    private Course cs147;
    private Course math161A;
    private Course phil134;

    //constructors
    public Student() {
        this.setCs151();
        this.setCS147();
        this.setMath161A();
        this.setPhil134();
    }
    public Student(String firstName, String lastName, int age, double GPA, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
        this.major = major;
        this.department = department;
        this.setCs151();
        this.setCS147();
        this.setMath161A();
        this.setPhil134();
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + "; Age: " + age + " GPA: " + GPA);
        System.out.println(major + " Major; " + department + " Department");
        System.out.println("Student Schedule: ");
        System.out.println(cs151.toString()+"\n" + cs147.toString()+"\n" + math161A.toString()+"\n" + phil134.toString()+"\n");

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCs151() {
        return cs151;
    }
    public void setCs151() {
        //CS151, Object Oriented Design and Programming, CS, 6:00pm, Tue.
        cs151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tuesday");
    }

    public Course getCs147() {
        return cs147;
    }
    public void setCS147() {
        cs147 = new Course("CS147", "Computer Architecture", "CS", "7:30pm", "Thursday");
    }

    public Course getMath161A() {
        return math161A;
    }
    public void setMath161A() {
        math161A = new Course("MATH161A", "Applied Probability and Statistics I", "MATH", "4:30pm", "Wednesday");
    }

    public Course getPhil134() {
        return phil134;
    }
    public void setPhil134() {
        phil134 = new Course("PHIL134", "Computers, Ethics, Society", "PHIL", "9:00am)", "Friday");
    }
}
