 class Student{
    protected int age;
    int a;
}

class StudentDeatils extends Student{
    public void mark(int a){
        this.a=a;
    }

    public int getAge(){
        return age;
    }
}

public class User{
    public static void main(String[] args){
        String name= "Jerin";
        StudentDeatils obj1 = new StudentDeatils();
        obj1.mark(20);
        System.out.println("name of Student" + name  );
    }
}