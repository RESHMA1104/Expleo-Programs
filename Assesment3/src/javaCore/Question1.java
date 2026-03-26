package javaCore;
import java.io.*;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        try {
            File file = new File("words.txt");
            Scanner sc = new Scanner(file);
            TreeMap<String, Integer> map = new TreeMap<>();
            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            sc.close();
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
            System.out.println("Unique words: " + map.size());

        } catch (FileNotFoundException e) {
            System.out.println("Error: words.txt not found");
        }
    }
}