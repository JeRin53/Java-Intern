import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double marks;

    public  void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setMarks(double marks){
        if(marks>=0 && marks<=100)
            this.marks=marks;
        else{
            System.out.println("Invalid");
        }

    }

    public String getGrade(){
        if(marks>=90)
            return "A";
        else if (marks>=70 && marks<=90)
            return "B";
        else if (marks>=50 && marks<=70)
            return "C";
        else
            return "D";

        
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int id = sc.nextInt();
       String name= sc.nextLine();
       double marks= sc.nextDouble();
       Student obj1= new Student();
       obj1.setId(id);
       obj1.setName(name);
       obj1.setMarks(marks);
       obj1.getGrade();
       

    }
}
