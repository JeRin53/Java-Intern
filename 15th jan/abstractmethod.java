abstract class abstractmethod{
        abstract void hello(String name);
}

public class fine extends abstractmethod{
                abstract void hello(String name);{
                System.out.println("This is a user-defined method.");
        }
        
        public static void main(String[] args){
                fine obj=new fine();
                obj.hello("sugale");
        }
}
        
