import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exp38 {
    public static void main(String[] args) {
        String filePath = "input.txt";
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    charCount += word.length();
                    vowelCount += countVowels(word);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + charCount);
        System.out.println("Vowel count: " + vowelCount);
    }

    private static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
