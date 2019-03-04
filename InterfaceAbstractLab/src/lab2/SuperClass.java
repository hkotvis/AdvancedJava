package lab2;

public interface SuperClass {

public void setCourseName(String courseName);
public String getCourseName();
public void setCourseNumber(String courseNumber);
public String getCourseNumber();
public void setCredits(double credits);
public double getCredits();


    public static void main(String[] args){
        SuperClass advj = new AdvancedJavaCourse("Advanced Java", "000-555");
        SuperClass introj = new IntroJavaCourse("Intro to Java", "000-444");
        SuperClass introp = new IntroToProgrammingCourse("Intro to Programming", "000-333");}

}
