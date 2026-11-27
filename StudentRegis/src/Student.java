public class Student {

    final String name;
    final int age;
    final float grade;

    public Student(String name, int age, float grade){ //Constructor for student identification and details
        if (name == null || name.isBlank()){
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

    public String getName(){ //getters for initialized details
        return name;
    }

    public int getAge(){
        return age;
    }

    public float getGrade(){
        return grade;
    }
    
}
