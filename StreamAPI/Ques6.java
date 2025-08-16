import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques6 {
    public static class Employee {
        String name;
        String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }
        
    }

    public static void main(String[] args) {
        //Given a list of employees, group them by department using Collectors.groupingBy.
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "IT"),
            new Employee("David", "Finance")
        );
        Map<String, List<Employee>> res= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        res.forEach((department, empList) -> {
            System.out.println("Department: " + department);
            empList.forEach(emp -> System.out.println("Name: " + emp.name));
        });
    }
}
