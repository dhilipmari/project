package IOEX;
import java.io.FileInputStream;
import java.io.IOException;


public class day18task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("M:\\IOex\\example.txt");
        int withsp=0;
        int withoutsp=0;
        int ch;
        while ((ch=fis.read())!=-1) {
            char currentchar=(char)ch;
            if(Character.isLetter(currentchar))
            {
                withsp++;
                withoutsp++;
                
            }
            else if(currentchar==' ')
            {
                withoutsp++;
            }
        }
        System.out.println("no of character :"+withsp);
        System.out.println("no of char without sp :"+withoutsp);
        fis.close();

    }
    
}
