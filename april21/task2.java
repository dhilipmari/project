package april21;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class task2 {
    public static void main(String[] args) throws IOException {
        String filepath="M:\\IOex\\example.txt";
       string[] lines=readFilelines(filepath);
       for(string line:lines)
       {
        System.out.println(line);
       }
     
    }
    private static string[] readFilelines(String filepath) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader b1=new BufferedReader(new FileReader(filepath));
        ArrayList<String>lineslist=new ArrayList<>();
        String line;
        
        while ((line=b1.readLine())!=null) {
            lineslist.add(line);

        }
        b1.close();
        return lineslist.toArray(new string[0]);   
    }
}
