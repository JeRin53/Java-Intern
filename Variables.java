public class Variables{
        int instance=10;
        static String x="I am static ";
        public void showVariables(){
                int localVar=5;
                
                System.out.println("Instance Variable: " + instance);
                System.out.println("Static Variable: " + x);
                System.out.println("Local Variable: " + localVar);
        }
        public static void main(String[] args)
        {
          Variables obj= new Variables();
          obj.showVariables();
          
          System.out.println("Accessing Static Variable via class: " + Variables.x);
        }
}
