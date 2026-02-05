class Test <T,U>{
    T name;
    U id;
    public Test(T name,U id){
        this.name=name;
        this.id=id;
    }
    
    T result(){
        return this.name;
    }
}



public class Person {
    public static void main(String[] args){
        Test<String,Integer> str= new Test<>("Geeks",2);
        System.out.println(str.result());
    }
    
}
