package april21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class task1 {
    public static void main(String[] args) throws IOException {
        String filepath="M:\\IOex\\dhilip.txt";
        int linecount=countlines(filepath);
        System.out.println("number of lines in the file: "+linecount);
    }
    public static int  countlines(String filepath) throws IOException {
        int count =0;
        BufferedReader br=new BufferedReader(new FileReader(filepath));
        while (br.readLine()!=null) {
            count++;
            
        }
        br.close();
        return count;
    
        
    }
    
}
