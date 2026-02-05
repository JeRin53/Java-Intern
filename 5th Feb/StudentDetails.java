public class Student{
    protected String name;
    int age;
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
        StudentDeatils obj1 = new StudentDeatils();
        obj1.mark(20);
        obj1.name="Jerin";
        System.out.println("name of Student" + obj1.name + );
    }
}