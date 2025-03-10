public class CollegeStudent extends Student {
    private String major;
    private int year;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // Getters and Setters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method to format output
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major; 
    }
}
