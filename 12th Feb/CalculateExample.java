@FunctionalInterface
interface Calculator{
int calculate(int a , int b);
}

public class CalculateExample{
    public static void main(String[] args){
        Calculator cal= (a,b) -> a+b ;
        Calculator cal1=(a,b) -> a*b;

        System.out.println(cal.calculate(5,3));
        System.out.println(cal1.calculate(4,7));
    }
}