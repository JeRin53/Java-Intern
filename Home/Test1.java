public class Test1 {
    public static void main(String[] args) {

        try {
            int a = 10 / 2;   // No error
            System.out.println("Inside try");
        } finally {
            System.out.println("Inside finally");
        }

    }
}
