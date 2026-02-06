import java.util.Arrays;

public class StringExample {
   public static void main(String args[]) {
      char[] helloArray = { 'j', 'e', 'r', 'i', 'n' };
      String obj1= Arrays.toString(helloArray);
      String obj2 = new String(helloArray);
      String name = "James";
      System.out.println(name.concat(obj2));
      System.out.println(obj2);
      System.out.println( obj1 );
      StringBuffer buffer = new StringBuffer(name);
      buffer.append("Joejoe");
      buffer.append(helloArray);
      
      System.out.print(buffer);
      System.out.print('\n');
      System.out.println("\n" + buffer.charAt(3));
   }
}