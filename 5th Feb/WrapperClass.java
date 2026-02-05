import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int n = 10;
        // n = null; 

        
        Integer w = 20;
        w = null; 

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(n); 
        numbers.add(w);

        
        String num = "123";
        int p = Integer.parseInt(num); 
        System.out.println("Parsed int: " + p);

        
        int a = numbers.get(0); 
        System.out.println("Unboxed int: " + a);
    }
}
