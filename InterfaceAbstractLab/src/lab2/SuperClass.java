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
        SuperClass introp = new IntroToProgrammingCourse("Intro to Programming", "000-333");

        System.out.println("The course is " + advj.getCourseName() + " and it's course number is " + advj.getCourseNumber()+ ".\nIt is "+ advj.getCredits() + " credits!");
        System.out.println("The course is " + introj.getCourseName() + " and it's course number is " + introj.getCourseNumber()+ ".\nIt is "+ introj.getCredits() + " credits!");
    }

}
