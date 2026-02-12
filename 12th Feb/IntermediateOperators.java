import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}
public class IntermediateOperators{
    public static void main(String[] args){
        
        List<Employee> employees = Arrays.asList(
                new Employee("Jerin", "IT", 500),
                new Employee("Rohan", "HR", 900));
        employees.stream()
        .filter(i -> i.getName().startsWith("J"))
        .toList()
        .forEach(System.out::println);

        List<String> ps = employees.stream()
        .map(i -> i.getName().toUpperCase())
        .toList();



    }
}