import java.util.*;
class Employee{
         int id ;
         int salary;
         String name;
         
            Employee(int id , int salary, String name){
              this.id=id;
              this.salary=salary;
              this.name=name;
            
            }
         
         void calulateSalary(){
           System.out.println(salary);     
         }
         
         class Manager extends Employee{
                        Manager(int id , String name , int salary, double bonus){
                        super(id,name,salary);
                        this.bonus=bonus;
                        }
                void calculateSalary(double bonus){
                        System.out.println("The bonus of user :"+ name + "is" + bonus);     
                        }
                public static void main(String[] args){
                Manager manager= new Manager(100,"John",101, 500.01);
                System.out.println(manager.calculateSalary());
                }
              }
            }
        
