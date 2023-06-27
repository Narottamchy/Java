import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exp37 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read the content from the input file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Print the content on the screen
        System.out.println("File Content:");
        System.out.println(content);

        // Write the content to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(content.toString());
            System.out.println("Content written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
