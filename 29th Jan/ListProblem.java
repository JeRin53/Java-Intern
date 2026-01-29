import java.util.*;

public class ListProblem{
    public static void main(String[] args)
    {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Jerin");
        ll.add("Jeese");
        ll.add("For");


        System.out.println(ll);

         ll.set(1,"is");

         System.out.println("After setting: " + ll);

    }
}