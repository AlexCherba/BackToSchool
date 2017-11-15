package school;

public class Teacher extends Person {
    private double salary;
    private String subject;
    private static final Object[][] SUBJECT_SALARY_ARRAY = new Object[4][2];

    static {
        SUBJECT_SALARY_ARRAY[0][0] = "Computer Science";
        SUBJECT_SALARY_ARRAY[0][1] = 100000.0d;
        SUBJECT_SALARY_ARRAY[1][0] = "Chemistry";
        SUBJECT_SALARY_ARRAY[1][1] = 90000.0d;
        SUBJECT_SALARY_ARRAY[2][0] = "English";
        SUBJECT_SALARY_ARRAY[2][1] = 110000.0d;
        SUBJECT_SALARY_ARRAY[3][0] = "Other";
        SUBJECT_SALARY_ARRAY[3][1] = 120000.0d;
    }

    Teacher() {
        this("Alex Boon", 40, "M", "Computer Science", 100000);
    }

    Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
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
