public class Printer {

    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }
    public void print(String text) {
        System.out.println("Printing string: " + text);
    }

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);
        p.print("Hello world");
    }
}
