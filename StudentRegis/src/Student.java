public class Student {

    private final String name;
    private final int age;
    private final float grade;

    public Student(String name, int age, float grade){          //Constructor for student identification and details
        if (name == null || name.isBlank()){                    // validation checks before creating an instance of Student
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (age <= 0){
            throw new IllegalArgumentException("Age must be a valid number.");
        }
        if (grade < 0 || grade > 100){
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName(){ //getter for name
        return name;
    }

    public int getAge(){ //getter for age
        return age;
    }

    public float getGrade(){ //getter for grade
        return grade;
    }
    
}
