interface Parser{
    public String parse(String s); 
}

class Student1 {
    public String convert(String s){
    if(s.length()==3)
        s= s.toUpperCase();
    else
        s= s.toLowerCase();
    return s;
    
}
}

class Student {
    public static void print(String s,Parser p){
        s=p.parse(s);
        System.out.print(s);
    }
}


public class MethodReference{
    public static void main(String[] args) {
        
        Student1 sc = new Student1();
        Student.print("Jerin",(s ->  sc.convert(s)));
        
    }
}