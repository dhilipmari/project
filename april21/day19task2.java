package april21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day19task2 {
     public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("M:\\IOex\\dhilip.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            String[] linesArray = lines.toArray(new String[0]);

            // Printing each line
            for (String l : linesArray) {
                System.out.println(l);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
