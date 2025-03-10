public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and Setters
    public String getIdNum() {
        return myIdNum;
    }

    public double  GetGPA() {
        return myGPA;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    //toString method to format output
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}

