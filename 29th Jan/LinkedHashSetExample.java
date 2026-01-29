import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");

        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " , ");
        }
        System.out.println();

    }
}
