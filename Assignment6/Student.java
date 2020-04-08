import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double GPA;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        GPA = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
    }

    public void addCourse(Course a) {
        courses.add(a);
    }
    public void removeCourse(Course a){
        courses.remove(a);
    }
    //sort courses: note: in test class this must be called using the attributes named in course.java exactly, otherwise defaults to error
    public void sortCourses(boolean ascending, String attribute){
        switch (attribute) {
            case "courseName":
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getCourseName().compareTo(o2.getCourseName());
                    }
                }); break;
            case "courseDesc":
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getCourseDesc().compareTo(o2.getCourseDesc());
                    }
                }); break;
            case "courseDept":
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getCourseDept().compareTo(o2.getCourseDept());
                    }
                }); break;
            case "time":
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getTime().compareTo(o2.getTime());
                    }
                }); break;
            case "weekday":
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getWeekday().compareTo(o2.getWeekday());
                    }
                }); break;
            default :
                System.out.println("Error: please sort by a valid attribute");
        }
        System.out.println("Courses sorted by " + attribute+":");
        if (ascending) {
            for (Course i : courses) {
                System.out.println(i.toString());
            }
        }
        else {
            for (int i=courses.size()-1; i>=0; i--) {
                System.out.println(courses.get(i).toString());
            }
        }
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

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }
}
