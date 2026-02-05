class Test <T>{
    T name;
    public Test(T name){
        this.name=name;
    }
    T result(){
        return this.name;
    }
}



public class User {
    public static void main(String[] args){
        Test<String> str= new Test<>("Geeks");
        System.out.println(str.result());
    }
    
}
