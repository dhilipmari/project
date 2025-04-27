package april21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3{
    public static void main(String[] args) throws IOException {
        
        String filepath="M:\\IOex\\dhilip.txt";
        String wordtofind="hello";
        int count=countwordOcuurences(filepath,wordtofind);
    }

    private static int countwordOcuurences(String filepath,String wordtofind)throws IOException {
        
        BufferedReader br=new BufferedReader(new FileReader(filepath));
        String line;
        int count=0;
        while((line=br.readLine())!=null)
        {
            String []words=line.split(" ");
            for(String w:words){
                String word=null;
                if(w.equalsIgnoreCase(word)){
                    count++;
                }

            }
            
        }
        System.out.println("The word "+ wordtofind +"occured count= "+ count);
        br.close();
        return count;
        
        
        
    }

    
}


    /* / public static void main(String[] args) {
        String text = "Java is powerful. Java is versatile. I love Java!";
        String wordToFind = "java";

        int count = countWordOccurrences(text, wordToFind);
        System.out.println("The word \"" + wordToFind + "\" occurred " + count + " times.");
    }

    public static int countWordOccurrences(String text, String word) {
        // Use regex to match full words, case-insensitive
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
    /* */


