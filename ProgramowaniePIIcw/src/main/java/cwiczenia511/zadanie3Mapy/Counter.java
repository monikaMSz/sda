package cwiczenia511.zadanie3Mapy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {

    Map<String, Integer> allWords = new TreeMap<>();

    void countWords() {
        try {
            Scanner skaner = new Scanner(new File("C:\\Users\\RENT\\Desktop\\pan-tadeusz.txt"));

            while (skaner.hasNext()) ;
            String word = skaner.next().toLowerCase().replaceAll("\\s+", " ").trim();

            if (allWords.containsKey(word)) {
                allWords.put(word, allWords.get(word) + 1);
            } else {
                allWords.put(word, 1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        for (Map.Entry<String, Integer> word : allWords.entrySet())

        {
            System.out.printf("%s -> %s\n", word.getKey(), word.getValue());

        }
    }
}