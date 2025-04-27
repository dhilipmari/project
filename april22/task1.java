package april22;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;

import april21.string;


public class task1 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new FileReader("M:\\IOex\\file.txt"));
        ArrayList<string> names= new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null) {
            names.add(line.trim());

      } 
      br.close();
      ArrayList<string> collections;
      collections.sort( (Comparator<? super string>) names);
      FileWriter fw=new FileWriter("M:\\IOex\\filecopy.txt");
      
      for(string name:names)
      {
        fw.write(name+"\n");
      }
      fw.close();
      System.out.println("name is assending order is stored in filecopy.txt");


            
        
    
    }
}    

