package lab1;

abstract public class Class{
    String courseName;
    String courseNum;
    protected double credits;

    final public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    final public String getCourseName(){
        return courseName;
    }

    final public void setCourseNum(String courseNum){
        this.courseNum = courseNum;
    }

    final public String getCourseNum(){
        return courseNum;
    }
    final public double getCredits() {
        return credits;
    }

    final public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            System.out.println( "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
     public static void main(String[] args){
         Class advj = new AdvancedJavaCourse("Advanced Java", "000-555");

         Class introj = new IntroJavaCourse("Intro to Java", "000-444");
         Class introp = new IntroToProgrammingCourse("Intro to Programming", "000-333");

     }

}
