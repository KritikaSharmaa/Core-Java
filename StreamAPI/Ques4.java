//Given a list of employees (name, age, salary), find all employees with salary > 50,000.

import java.util.List;

public class Ques4 {
    public static class employees{
        String name;
        int age;
        int salary;
        public employees(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
      List<employees> empList = List.of(
            new employees("Alice", 30, 60000),
            new employees("Bob", 25, 45000),
            new employees("Charlie", 35, 70000),
            new employees("David", 28, 48000)
        );
        List<employees> res = empList.stream().filter(emp->emp.salary>50000).toList();
        res.forEach(emp-> System.out.println("Name: " + emp.name + ", Age: " + emp.age + ", Salary: " + emp.salary));
    }
}

