import java.text.NumberFormat;

public class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to format output
    public String toString() {

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        return super.toString() + ", subject: " + subject + ", salary: " + currencyFormat.format(salary);
    }
}
