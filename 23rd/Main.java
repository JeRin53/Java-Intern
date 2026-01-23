import java.util.SortedSet;
import java.util.TreeSet;

public class Main{
        public static void main(String[] args)
        {
        SortedSet<Integer> scores = new TreeSet<Integer>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(90);
        scores.add(85);
        scores.add(88);
        
        
        System.out.println("Scores in ascendiing order" + scores);
        
        System.out.println("Scores in lowest" + scores.first());
        
        System.out.println("Scores in highest" + scores.last());
        
        System.out.println("Scores less than 90 : " + scores.headSet(90));
        
        System.out.println("Scores in greater than or equal to 88" + scores.tailSet(88));
        
        scores.remove(78);
        System.out.println("Scores in ascendiing order" + scores);
        
        
      }

}



