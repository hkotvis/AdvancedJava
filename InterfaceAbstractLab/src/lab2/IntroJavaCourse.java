package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Hailey Kotvis
 */
public class IntroJavaCourse implements SuperClass{
    String courseName;
    String courseNumber;
    double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    @Override
    public double getCredits() {
        return credits;
    }
    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
