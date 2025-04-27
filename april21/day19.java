package april21;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class day19 {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("M:\\IOex\\dhilip.txt"); // Replace with your file path
            List<String> linesList = Files.readAllLines(filePath);
            String[] linesArray = linesList.toArray(new String[0]);

            // Printing each line
            for (String line : linesArray) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
