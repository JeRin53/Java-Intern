public class Test {
    public static void main(String[] args) {

        try {
            try {
                int a = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }

    }
}
