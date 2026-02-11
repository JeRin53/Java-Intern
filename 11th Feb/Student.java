import java.util.Scanner;

class Details{
    private String name;
    private int id;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public void setId(int newId){
        this.id=newId;
    }
}

class Mark extends Details{

}


public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nam= sc.next();

        Details p = new Details();

        p.setName(nam);
        System.out.print(p.getName());



    }
}