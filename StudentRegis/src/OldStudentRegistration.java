import java.util.ArrayList;
import java.util.List;

public class OldStudentRegistration {

    static List<String> students = new ArrayList<>();

    public static void addStudent(String name, int age, double grade) {

        students.add(name);

        System.out.println("Student Added!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void display() {

        for (String s : students) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        addStudent("", -5, 150);
        addStudent("John", 20, 85);
        addStudent("John", 20, 85);

        display();
    }
}
