 class Outer{
                public void method1(String name){
                        System.out.println("Hey There " + name);
                }
                
                
                public class InnerC{
                public void method2(String name){
                    class Inner{
                        String wish="Whats up";
                         void InnerMethod(){
                        System.out.println("How are you "+ name);
                        System.out.println(wish);
                        }
                        
                        }
                        Inner obj3=new Inner();
                        obj3.InnerMethod();
                
              }

}

}
public class InnerClass
{
                public static void main(String[] args)
                {
                Outer obj = new Outer();
                obj.method1("Jerin");
                Outer.InnerC obj2 = obj.new InnerC();
                obj2.method2("Jerin");
                
                }
}
