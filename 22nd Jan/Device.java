interface phoneFunction{
void Call(String name);
}

class phone{
private String password="1234";
public void phoneUnlock(String attempt){
if(attempt.equals(password)){
System.out.println("phone unlocks");
}
else{
System.out.println("phone does not unlocks");
}
}
}

class phoneCall extends phone implements phoneFunction{

public void Call(String name){
System.out.println("Phone calling" + name + "via 5g");
}
}

public class Device{
public static void main(String[] args){
phoneCall obj1= new phoneCall();
obj1.Call("Jerin");
obj1.phoneUnlock("1234");

}
}
