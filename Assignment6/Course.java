public class Course {
    private String courseName;
    private String courseDesc;
    private String courseDept;
    private String time;
    private String weekday;


    public Course(String courseName, String courseDesc, String courseDept, String time, String weekday) {
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.courseDept = courseDept;
        this.time = time;
        this.weekday = weekday;
    }

    public String toString() {

        return courseName + "; " + courseDesc + "; " + courseDept + "; " + time + " " + weekday;
    }
    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
