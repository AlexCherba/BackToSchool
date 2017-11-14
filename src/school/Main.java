package school;

public class Main {
    public static void main(String[] args) {

        Person[] personArray = {
                new Person(),
                new Person("Dima Bilan", 32, "M"),
                new Student(),
                new Student("Andy Dan", 19, "M", 78435454, 4.01),
                new Teacher(),
                new Teacher("Victoria Peres", 35, "F", "English", 110000.0d),
                new CollegeStudent(),
                new CollegeStudent("Nina Dubstep", 22, "F", 973443, 5.0, 4, "Undeclared")
        };

        for (Person i : personArray) {
            System.out.println(i);
        }
    }

}
