import java.util.ArrayList;
import java.util.List;

public class RevisedRegistration {
    private static final List<Student> students = new ArrayList<>();

    public static void addStudent(String name, int age, float grade){
        
        if (name == null || name.isBlank()){
            System.out.println("\nInvalid Name.");
            return;
        }

        if (age <= 0){
            System.out.println("\nInvalid Age for " + name + ": " + age);
            return;
        }

        if (grade < 0 || grade > 100){
            System.out.println("\nInvalid Grade for " + name + ": " + grade);
            return;
        }

        for (Student s : students){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("\nStudent already exists: " + name);
                return;
            }
        }

        Student student = new Student(name, age, grade);
        students.add(student);
        System.out.println("Student Registered!");
        
    }

    public static void display(){
        System.out.println("\nRegistered Students:");
        for (Student s: students){
            System.out.println(s.getName());
        }
    }

    public static void main(String[] args){
        addStudent("Julius", 25, 80); //Accepts
        addStudent("AJ", 21, 95); //Accepts
        addStudent("Rorie", 21, 99); //Accepts
        addStudent("Julius", -9000, -4); // Reject

        display();
    }
}
