package school;

public class Teacher extends Person {
    private double salary;
    private String subject;
    public static Object[][] subjectAndSalaryArray = new Object[4][2];

    {
        subjectAndSalaryArray[0][0] = "Computer Science";
        subjectAndSalaryArray[0][1] = 100000.0d;
        subjectAndSalaryArray[1][0] = "Chemistry";
        subjectAndSalaryArray[1][1] = 90000.0d;
        subjectAndSalaryArray[2][0] = "English";
        subjectAndSalaryArray[2][1] = 110000.0d;
        subjectAndSalaryArray[3][0] = "Other";
        subjectAndSalaryArray[3][1] = 120000.0d;
    }

    public Teacher(){
        this("Alex Boon",40, "Man", "Computer Science",100000);
    }
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.setSubject(subject);
        this.setSalary(salary);
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
        return super.toString();
    }
}
