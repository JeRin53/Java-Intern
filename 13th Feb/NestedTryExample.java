public class NestedTryExample{
    public static void main(String[]args){
        try {
            System.out.println("Outer try block executed.");

            try {
                System.out.println("Nested try block inside finally executed.");
                
            } catch (Exception e) {
                 System.out.println("Inner catch: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block: Resource 1 cleanup.");
            }
            
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            try {
                
                System.out.println("Nested try block inside outer finally.");
                
                int result = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch in outer finally: " + e.getMessage());
            } finally {
                System.out.println("Nested finally inside outer finally: Resource 2 cleanup.");
            }
        }
    }
}