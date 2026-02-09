class Thread1 extends Thread{
    public void run(){
    for(int i=0;i<=50;i++){
        System.out.println("Numbers from 1 to 50 are :"+ i);
       }
    }
}
class Thread2 extends Thread{
    public void run(){
    for(int i=51;i<=100;i++){
        System.out.println("Numbers from 51 to 100 are :"+ i);
       }
    }
}

class Thread3 extends Thread{
    public void run(){
    for(int i=1;i<=100;i++){
        int sum=0;
        sum +=i;
        System.out.println("Numbers sumed from 1 to 100 is :"+ sum);
       }
    }
}


public class ThreadMain {
    public static void main(String[]args){
        Thread1 ts = new Thread1();
        Thread2 ts1 = new Thread2();
        Thread3 ts2 = new Thread3();
        ts.start();
        ts1.start();
        ts2.start();
    }
    
}
