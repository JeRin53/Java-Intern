@FunctionalInterface
interface Exam{
    void show();
}


public class  Student  {
    public static void main(String[] args){
        Exam obj1= ()-> System.out.println("Hello");
            

        obj1.show();
    }
}
