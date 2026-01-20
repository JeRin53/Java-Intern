public class MultiThreading{
                public static void main(String[] args)
                {
                        for(int i=0;i<=3;i++){
                        MultiThreadThing obj= new MultiThreadThing(i);
                        obj.run();
                        }
                
                }


}
class MultiThreadThing extends Thread{
private int threadNumber;
          public MultiThreadThing(int threadNumber){
                  this.threadNumber=threadNumber;
          }
                public void run(){
                for(int i=0;i<=3;i++){
                        System.out.println(i + "Belong to Thread Number:" + threadNumber);
                try{
                Thread.sleep(1000);
                
                
                }catch(InterruptedException e)
                {
                
                }
                }
                
                
                }
}
