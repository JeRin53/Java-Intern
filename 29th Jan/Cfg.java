import java.io.*;
class Cfg{
    enum Color{
        RED, BLUE, GREEN;
    }
   public static void main(String[]args){
        Color cc=Color.RED;
        switch(cc){
            case RED:
            System.out.println("Red color");
            break;
        case GREEN:
            System.out.println("Green color");
            break;
        case BLUE:
            System.out.println("Blue color");
            break;
        default:
            System.out.println("Other color");
        }
   }
}