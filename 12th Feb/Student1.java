@FunctionalInterface
interface Exam{
    int add(int i,int j);
}


public class  Student1  {
    public static void main(String[] args){
        Exam obj1= (i, j) ->  i+j;
            
        System.out.println(obj1.add(3,5));
    }
}
