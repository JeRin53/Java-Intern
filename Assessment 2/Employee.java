import java.util.*;

public class Employee{

    String name;
    String company;
    double salary;
    int service;

     Employee(String name, String company, double salary, int service){
        this.name=name;
        this.company=company;
        this.salary=salary;
        this.service=service;
    }

    void Display(){
            System.out.println(name +" "+ company + " "+ salary + "" + service);
    }

    void Range(){
        if(salary>=35000 && salary<=55000){
            System.out.println("Employees whos salary is in between 35000 to 55000 years :  "+name +"  "+ company + " " + salary +"  " +service);
        }
        if(service>=2 && service<=4){
            System.out.println("Employees whos service is in between 2 to 4 years :"+name +"  "+ company + " " + salary +"  " +service);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Employee[] arr= new Employee[2];
        
        for(int i=0; i<arr.length;i++){
        System.out.println ("Name:");
        String name= sc.next();
        System.out.println ("Company:");
        String company= sc.next();
        System.out.println ("Salary:");
        double salary= sc.nextDouble();
        System.out.println ("Service:");
        int service= sc.nextInt();
        arr[i] = new Employee(name, company, salary, service);
        }
        System.out.println("Employee Details are given below:");
        for(Employee e: arr){
            e.Display();
        }
        System.out.println("Employee Salary and Service is given below:");
        for(Employee e: arr){
            e.Range();
        }
    }
}