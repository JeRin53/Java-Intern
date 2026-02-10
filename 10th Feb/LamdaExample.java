interface A{
    void show(int i);
}

class Student implements A{
    public void show(int i){
        System.out.println("Hello " + i);
    }
}

public class LamdaExample {
    public static void main(String[] args){
        A obj1;
        // obj1= new Student();
        // obj1.show();
        obj1= (i) -> System.out.println("Hello");
        obj1.show(3);
        };
    }
