import java.util.ArrayList;
import java.util.List;

public class RevisedRegistration {
    private static final List<Student> students = new ArrayList<>(); //Use List for flexibility and maintainability

    public static void addStudent(Student student){                 //Refactored to only handle adding students
        if(student == null){
            throw new IllegalArgumentException("Student cannot be null.");
        }

        for (Student exists : students){ //checks for duplicate entries
            if(exists.getName().equalsIgnoreCase(student.getName())){
                throw new IllegalArgumentException("Student already exists: " + student.getName());
            }
        }

        students.add(student);
        
    }

    public static void registerStudent(String name, int age, float grade){      //Created new method for verification
        try{
            Student student = new Student(name, age, grade);
            addStudent(student);
            System.out.println("\nStudent Registered!");
        }
        catch (IllegalArgumentException e){
            System.out.println("\nRegistration failed: " + e.getMessage());
        }
    }

    public static void displayStudents(){ //revised student display method, uses getter for better data handling
        System.out.println("\nRegistered Students:");
        for (Student s: students){
            System.out.println(s);
        }
    }

    public static void main(String[] args){

        registerStudent("Rorie", 21, 99);       //Accepts
        registerStudent("AJ", 21, 95);          //Accepts
        registerStudent("Julius", 21, 87);      //Accepts
        registerStudent("Julius", 21, 67);      //Reject
        registerStudent("James", 50, -4);             //Reject

        displayStudents();
    }
}
