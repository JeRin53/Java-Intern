interface Greeting{
    void show();
}

public class GreetingExample{
    public static void main(String[] args){
        Greeting greet= new Greeting(){
            public void show(){
                System.out.println("Hello Good morning");
            }
        };
        Greeting greet1= () -> System.out.println("Hello Good morning");
        greet1.show();
    }
}