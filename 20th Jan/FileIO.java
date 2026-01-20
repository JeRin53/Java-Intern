import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIO{
        public static void main(String[] args){
                String[] std={"Arun","John","jerry"};
        try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
                writer.write("Hi hello");
                
                for(int i=0;i<std.length;i++){
                        writer.write("\n "+ std[i]);
                        }
                writer.close();
        }catch (IOException e) {
        
        e.printStackTrace();
        
        
        }
        try{
              BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
              String line;
              while((line = reader.readLine()) != null)
                  System.out.println(line);
              reader.close();
            }
            catch(IOException e){
            e.printStackTrace();
            }
                
        
        
        }
        }
