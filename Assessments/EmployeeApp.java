import java.time.LocalDate;
import java.time.Period;

class InsufficentLeaveException extends Exception {
    public InsufficentLeaveException(String message) {
        super(message);
    }
}

class Employee{

        String empId;
        String empName;
        LocalDate joiningDate;
        int totalLeaves;

public  Employee(String id,String name,LocalDate date,int leaves){
        empId=id;
        empName=name;
        joiningDate=date;
        totalLeaves=leaves;
}
     public String stringBuffer() {   
        StringBuffer sb= new StringBuffer();
        sb.append("Employee ");
        sb.append(empName);
        sb.append(" has ");
        sb.append(totalLeaves);
        sb.append(" leaves");
        return sb.toString();
      }  
      
            public int calculateExperience() {
                LocalDate today = LocalDate.now();
                Period p = Period.between(joiningDate, today);
                return p.getYears();
      
      } 
                public void applyLeave(int days) throws InsufficentLeaveException {
                if(days>totalLeaves) {
                        throw new InsufficentLeaveException("Insufficient leaves available");
               
                }
                totalLeaves= totalLeaves-days;
              
                
                
                
                }
        }
public class EmployeeApp {

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("E101", "Jerin", LocalDate.of(2020, 1, 10), 20);
        emp[1] = new Employee("E102", "Arjun", LocalDate.of(2019, 6, 15), 18);
        emp[2] = new Employee("E103", "Paul", LocalDate.of(2018, 4, 5), 25);
        emp[3] = new Employee("E104", "Anu",   LocalDate.of(2021, 8, 20), 15);
        emp[4] = new Employee("E105", "Vishal", LocalDate.of(2017, 11, 1), 30);
        
      for (int i = 0; i < emp.length; i++) {
         
         try {
                
                emp[i].applyLeave(5);
            } catch (InsufficentLeaveException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Employee ID: " + emp[i].empId);
            System.out.println("Name: " + emp[i].empName);
            System.out.println("Joining Date: " + emp[i].joiningDate);
            System.out.println("Years of Experience: " + emp[i].calculateExperience());
            System.out.println("Remaining Leaves: " + emp[i].totalLeaves);
            System.out.println("Message: " + emp[i].stringBuffer());
            System.out.println("\n");
        }
        
        }
      }
      
