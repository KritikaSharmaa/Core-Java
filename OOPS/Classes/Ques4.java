// Create a class Employee with id, name, and salary.
// In the main method, create an array of 5 employees with sample data, and print details of employees whose salary is above 50,000.

// Employee.java
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // toString method to print employee details
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee(101, "Aarav", 48000);
        emp[1] = new Employee(102, "Meera", 52000);
        emp[2] = new Employee(103, "Rahul", 60000);
        emp[3] = new Employee(104, "Sneha", 45000);
        emp[4] = new Employee(105, "Karan", 75000);

        for (int i = 0; i < emp.length; i++) {
           if(emp[i].getSalary() > 50000)
                System.out.println(emp[i].getSalary());
        }
    }
}
