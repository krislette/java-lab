package list;

public class Student {
    
    String strName, strCourse;

    public Student(String strName, String strCourse) {
        this.strName = strName;
        this.strCourse = strCourse;
    }

    public void printIntroduction() {
        System.out.println("I am " + strName + " from " + strCourse + ".");
    }

}