package school;

public class Student extends Person{
    private int idNumber;
    private double gpa;

    Student() {
        this("Cim Cin Un",44, "M", 3543543 , 4.43);
    }

    Student(String name, int age, String gender, int idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", student id: " + getIdNumber() + ", gpa: " + getGpa() ;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
