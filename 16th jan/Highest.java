public class Highest{
public static void main(String[] args)
{
int[]arr={10,20,30,40,9,3,30};
int max= arr[0];
int min=arr[0];

for(int n:arr){
if(max<n)
{
max=n;
}
if(min>n)
{
min=n;
;
}
}
System.out.println("Max="+ (max));
System.out.println("Min="+ (min));
}
}
