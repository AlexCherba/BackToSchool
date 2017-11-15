package school;

public class CollegeStudent extends Student {
    private int year;
    private String major;

    private static final String[] MAJOR_ARRAY = {
            "Electrical Engineering",
            "Communications",
            "Undeclared"
    };

    private static final int[] YEA_RARRAY = {1, 2, 3, 4, 5};

    CollegeStudent() {
        this("Oleg Utkin", 19, "M", 3434, 4.5, 2, "Communications");
    }

    CollegeStudent(String name, int age, String gender, int idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + getYear() + ", major: " + getMajor();
    }
}
