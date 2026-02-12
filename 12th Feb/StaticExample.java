interface MathUtility {
    static int square(int x) {
        return x * x;
    }
}

class A implements MathUtility{

}
public class StaticExample {
    public static void main(String[] args) {
        MathUtility math = new A();
        math.square(3);
        System.out.println(MathUtility.square(5)); 
    }
}
