import java.util.*;
class InvalidinputException extends Exception{
                InvalidinputException(String mssg){
                super(mssg);
                }
          }
          class TextAnalyser{
          
          static void analyzer(String text) throws InvalidinputException(String mssg)
          {
          if (text==null()){
                throws new Invalidinputexception("Invalid message");
          }
          }
          
          String reversed= new StringBuilder(text.reverse().toString());
          for(String w: words){
                if(w.length()> longest.length()){
                longest=w;
                }
          }
          void countChar(String text){
          System.out.println("Total Characters: ", text.length);
          }
          void countWord(String text){
          System.out.println("Total words: ", w.length);
          }
          void longest(String text){
          System.out.println("Longest word: ", longest);
          }
        }
          class TextA{
          public static void main(String[] args)
          {
          String text="word";
          TextAnalyser.analyzer(text);
          TextAnalyser t1= new TextAnalyser();
          t1.countChar(text);
          t1.countWord(text);          
          t1.longest(text);          
          
          }
         }
