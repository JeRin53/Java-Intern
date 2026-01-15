public class Datatypes {
public static void main(String args[])
{
byte b=10;
int i=10;
short s=10;
long l=10l;

float f=10.01f;
double d=1.1233;

char c='A';
boolean flag= true;

String str="Hello";
int[] arr={1,2,3};
Integer dataInt=Integer.valueOf(50);
StringBuilder sb = new StringBuilder("Java");


        System.out.println("Byte of "+ b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
System.out.print("Array : ");
for(int num:arr)
	System.out.print(num +" ");
System.out.println();

        System.out.println("Wrapper Integer: " + dataInt);
        System.out.println("StringBuilder: " + sb);
}
}
