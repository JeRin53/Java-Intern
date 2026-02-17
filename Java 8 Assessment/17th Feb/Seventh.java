import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    String name;
    String dept;

    Employee(String name,String dept){
        this.name= name;
        this.dept=dept;
    }
}


public class Seventh{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<n;i++){
                String name= sc.next();
                String dept= sc.next();
                list.add(new Employee(name, dept));
        }
        list.stream()
        .collect(Collectors.groupingBy(e ->e.dept))
        .forEach(dept,emp) -> {
            System.out.println(dept + " : ");
            emp.forEach(x -> System.out.println(x.name));
        };
        
        
        }
    }