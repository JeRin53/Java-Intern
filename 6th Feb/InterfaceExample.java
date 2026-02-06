interface AClass{
    void show();
}
interface BClass extends AClass{
    void exam();
}
class Student implements BClass{
    public void show(){
        System.out.println("Show completed");
    }

    public void exam(){
        System.out.println("Exam done");
    }
}
public class InterfaceExample{
    public static void main(String[] args){
        Student obj1= new Student();
        obj1.show();
        obj1.exam();
    }
}