package lab1;

import javax.swing.JOptionPane;

/**
 * Tells user the course, creds, course num and pre-reqs
 *
 * @author      Hailey Kotvis
 * @version     1.00
 */
public class AdvancedJavaCourse extends Class{
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNum(courseNumber);
        System.out.println("This is " + super.courseName + " and has " + super.credits + " credits.\nCourse Number: " + super.courseNum);
        setPrerequisites("Intro to Java");
        System.out.println("Prerequisites are " + getPrerequisites());
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

}
