import java.util.LinkedList;

public class IterateList{
    public static void main(String[] args)
    {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Jerin");
        ll.add("Jeese");
        ll.add(1,"For");

        for(String s :  ll){
            System.out.println(ll);
        }

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + "");
        }

    }
}