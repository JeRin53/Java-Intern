import java.util.*;
import java.time.LocalDate;
class Employee{
         int empId ;
         int salary;
         String empName;
         LocalDate joiningDate;
         double annualSalary;
         
         Employee(int id,String name,int salary,LocalDate date){
         empId=id;
         salary=salary;
         empName=name;
         joiningDate=date;
         }
         
         float calculateSalary(int salary){
         System.out.println("Annual salary = " );
         return salary;
         annualSalary= salary*12 ;
         if(annualSalary>1000000){
         System.out.println("High salary");
         }
         else{
         System.out.println("Normal salary");
         }
        }
         
         public static void main(String[] args)
         {
         Employee e1= new Employee(1,"Arun",9000, LocalDate.of(2020,1,10));
         Employee e2= new Employee(2,"Rohan",7000, LocalDate.of(2021,1,10));
         Employee e3= new Employee(3,"Jeese",13000, LocalDate.of(2022,1,10));
         
         e1.calculateSalary(5000);
         e2.calculateSalary(4000);
         e3.calculateSalary(11000);
         }
}
         
         
         
        
        
        
                
                
