import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        String inputFile = "textfile.txt";  

        
        countWords(inputFile);
    }

    
    public static void countWords(String inputFile) {
      
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            Map<String, Integer> wordCountMap = new HashMap<>();
            
          
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.split("\\W+");

                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();  
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            
            List<Map.Entry<String, Integer>> sortedWordList = new ArrayList<>(wordCountMap.entrySet());
            sortedWordList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            
            System.out.println("Top 5 Most Frequent Words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWordList) {
                if (count >= 5) break;
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            }

        } catch (IOException e) {
            System.err.println("IOException occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
