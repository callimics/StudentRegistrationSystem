import java.util.ArrayList;
import java.util.List;

public class RevisedRegistration {
    private static final List<Student> students = new ArrayList<>(); //Use List for flexibility and maintainability

    public static void addStudent(String name, int age, float grade){
        
        if (name == null || name.isBlank()){ //input checks for each variable
            System.out.println("\nInvalid Name.");
            return;
        }

        if (age <= 0){ //input checks for each variable
            System.out.println("\nInvalid Age for " + name + ": " + age);
            return;
        }

        if (grade < 0 || grade > 100){ //input checks for each variable
            System.out.println("\nInvalid Grade for " + name + ": " + grade);
            return;
        }

        for (Student s : students){ //checks for duplicate entries
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("\nStudent already exists: " + name);
                return;
            }
        }

        Student student = new Student(name, age, grade); //once all checks are validated, add student to List
        students.add(student);
        System.out.println("Student Registered!"); //confirmation message once added
        
    }

    public static void display(){ //revised student display method, uses getter for better data handling
        System.out.println("\nRegistered Students:");
        for (Student s: students){
            System.out.println(s.getName());
        }
    }

    public static void main(String[] args){
        addStudent("Julius", 25, 80);    //Accepts
        addStudent("AJ", 21, 95);        //Accepts
        addStudent("Rorie", 21, 99);     //Accepts
        addStudent("Julius", -9000, -4);            //Reject

        display();
    }
}
