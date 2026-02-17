import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

 class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name= name;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public void setId(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }
    public void setSalary(){
        this.salary=salary;
    }

    public String toString(){
        return "Employee id : " +id + " name : " + name + " salary : " +salary ;
    }
}


public class Ten{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit:");
        int n= sc.nextInt();
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter id:");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name:");
            String name= sc.nextLine();
            System.out.println("Enter salary:");
            double salary= sc.nextDouble();
            sc.nextLine();
                
            list.add(new Employee(id,name, salary));
        }

        List<Employee> salary =list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(salary);
    }
}