public class Halt{
 static int sum(int x,int y)
{
if(y>x)
{
return y + sum(x,y-1);
}
else{
return x;
}
}
public static void main(String[] args){
System.out.println("Sum of 5 to 10:"+sum(5,10));
}
}

