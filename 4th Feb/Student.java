import java.util.*;
class User{
    int value;
     User(int value){
        this.value=value;
    }
void display(){
    System.out.print("value is :" + this.value);
}
}



public class Student {
    public static void main(String[] args) {
        User us = new User(30);
        us.display();
        TreeSet<Integer> tm = new TreeSet<Integer>();
        tm.add(1);
        tm.add(2);
        System.out.println(tm);
    }
    
}
