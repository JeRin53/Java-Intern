import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> uppercaseWords  =  employees.stream().map(employee -> employee.getName().toUpperCase()).toList();

        List<String> sortedEmployeeName  =  employees.stream()
            .sorted(Comparator.comparing(employee -> employee.getName()))
            .map(employee -> employee.getName())
            .collect(Collectors.toList());

        System.out.println(sortedEmployeeName); 


        List<String> words = Arrays.asList("hello","hello","world", "world", "java", "stream", "example");
        
        List<String> distinctEords  = words.stream().distinct().toList();
        System.out.println("distinct words" + distinctEords);

        List<String> sorted = words.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted); 

        List<String> skipItem = words.stream().skip(2).toList();
        System.out.println(skipItem); 

        List<String> limitItem = words.stream().distinct().limit(3).toList();
        System.out.println(limitItem); 
        
    }

 }