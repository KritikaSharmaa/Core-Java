// Q2: Class with Constructor
// Create a class Student with:
// name (String)
// rollNo (int)
// grade (char)

// Use a constructor to initialize values. Create one Student objects with different data and print their details.

public class Ques2 {
    public static void main(String[] args) {
        Student s1 = new Student("Kritika", 101, 'A');
        Student s2 = new Student("Aditi", 100, 'B');
        s1.studentInfo();
        s2.studentInfo();
    }
}

class Student {
    String name;
    int roll_no;
    char grade;

    Student(String name, int roll_no, char grade) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
    }

    void studentInfo(){
        System.out.println(name+" "+roll_no+" "+grade);
    }
}