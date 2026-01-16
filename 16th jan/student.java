public class Student
        {
                int studentdId;
                String studentName;
                float marks;
                
        student(){
                studentId=0;
                studentName="Unknown";
                marks=0.0;
                
         student(int id , String name,float m){
         studentId=id;
         studentName=name;
         marks=m;
        }
        void displaydetails(){
                System.out.println("Student id :=" +studentId);
                System.out.println("stduent name"+ student Name);
                System.out.println("marks:"+marks);
        }
        void calculategrade(){
        char grade;
        if(marks>=80)
                grade='A';
        else if(marks>=60)
                grade='B';
        else
                grade='C';
        System.out.println("Grade :=" + grade);
        }
        }             
        }

public class StudentApp{
        public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student(10,"amit",90);
        
        student1.displaydetails();
        student1.calculategrade();
        
        student2.displaydetails();
        student2.calculategrade();
        }
        }
        
        
        
        
        
