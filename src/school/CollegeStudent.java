package school;

public class CollegeStudent extends Student {
    int year;
    String major;

    public static String[] majorArray = {
            "Electrical Engineering",
            "Communications",
            "Undeclared"
    };
    public static int[] yearArray = {1, 2, 3, 4, 5};

    public CollegeStudent() {
        this("Oleg Utkin", 19, "man", 3434, 4.5, 2, "Communications");
    }
    public CollegeStudent(String name, int age, String gender, int idNumber, double gpa, int year, String major){
        super.setGpa(gpa);
        super.setIdNumber(idNumber);

    };

    @Override
    public String toString() {
        return super.toString();
    }
}
