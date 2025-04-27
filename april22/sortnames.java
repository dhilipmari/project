package april22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortnames {
    public static void main(String[] args) {
        String inputFile = "Names.txt";
        String outputFile = "Namescopy.txt";

        List<String> names = new ArrayList<>();

        // Step 1: Read names from Names.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("M:\\IOex\\file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line.trim()); // Trim to remove any extra spaces
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Step 2: Sort the names in ascending order
        Collections.sort(names);

        // Step 3: Write sorted names to Namescopy.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("M:\\IOex\\filecopy.txt"))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("Names have been sorted and written to " + outputFile);
    }
    
}
