// Q3: Inheritance + Constructor Chaining
// Create a class Person with attributes name and age, and a parameterized constructor.
// Create a subclass Employee with salary and designation, and use constructor chaining to initialize all values.
// Print details from the Employee class.

// 🔍 Concept Covered: super() keyword, constructor chaining, inheritance hierarchy

public class Ques2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Kriti", 26, 50000, "SDE");
        emp.display();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int Salary;
    String designation;

    Employee(String name, int age, int Salary, String designation) {
        super(name, age);
        this.Salary = Salary;
        this.designation = designation;
    }

    void display() {
        System.out.println(name + " " + age + " " + Salary + " " + designation);
    }
}
