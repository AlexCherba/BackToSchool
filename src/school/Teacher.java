package school;

public class Teacher extends Person {
    private double salary;
    private String subject;
    private static Object[][] subjectAndSalaryArray = new Object[4][2];

    static {
        subjectAndSalaryArray[0][0] = "Computer Science";
        subjectAndSalaryArray[0][1] = 100000.0d;
        subjectAndSalaryArray[1][0] = "Chemistry";
        subjectAndSalaryArray[1][1] = 90000.0d;
        subjectAndSalaryArray[2][0] = "English";
        subjectAndSalaryArray[2][1] = 110000.0d;
        subjectAndSalaryArray[3][0] = "Other";
        subjectAndSalaryArray[3][1] = 120000.0d;
    }

    Teacher() {
        this("Alex Boon", 40, "M", "Computer Science", 100000);
    }

    Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        setSubject(subject);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + getSubject() + ", salary: " + getSalary();
    }
}
