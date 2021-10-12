package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Map;
import java.util.TreeMap;
//The word counter splits the file (string) to find the desired word, while looping over the elements in the hash
//For every desired word found, '*' will be printed out.
public class wordCounter {
    public static Object getWordFrequency(String fileContent) {
        {
            Map<String, Integer> mp = new TreeMap<>();
            String[] arr = fileContent.split(" ");
            for (String s : arr) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1); }
            }
            for (Map.Entry<String, Integer> entry :
                    mp.entrySet()) {
                System.out.print(entry.getKey() +
                        ": ");
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print("*"); } //1 "*" means a word was found 1 time(s), 2 "*" means a word was found 2 time(s), and so on...
                System.out.print("\n"); }
        }
        return null; }
}