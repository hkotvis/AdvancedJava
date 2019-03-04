package lab1;

/**
 * Just has pre-reqs and the names/num of course
 *
 * @author      Hailey Kotvis
 */
public class IntroJavaCourse extends Class {

    String prerequisites = "Intro to Programming";

    public IntroJavaCourse(String courseName, String courseNum) {
        this.courseName = courseName;
        this.courseNum = courseNum;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }



}
