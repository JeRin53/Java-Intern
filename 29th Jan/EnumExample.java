import java.io.*;
import java.util.EnumSet;
public class   EnumExample{
    enum Color{
        RED, BLUE, GREEN;
    }

    public static void main(String[] args){

            EnumSet<Color> e1=EnumSet.range(Color.BLUE, Color.GREEN) ;
            System.out.print(e1);
        }
    }