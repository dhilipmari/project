package IOEX;

import java.io.FileInputStream;
import java.io.IOException;

public class day18 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("M:\\IOex\\example.txt");
        int charcount=0;
        int digitcount=0;
        int ch;
        while ((ch=fis.read())!=-1) {
            char currentchar=(char)ch;
            if(Character.isLetter(currentchar))
            {
                charcount++;
            }
            else if(Character.isDigit(currentchar))
            {
                digitcount++;
            }
        }
        System.out.println("no of alphabets :"+charcount);
        System.out.println("no of digits :"+digitcount);
        fis.close();

    }
    
}
