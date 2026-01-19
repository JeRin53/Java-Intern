public class Countdown{
 static void count(int x)
  {
    if(x>0)
    {
      System.out.print(x + " ");
      count(x-1);
    }
}
public static void main(String[] args){
count(10);
}
}
