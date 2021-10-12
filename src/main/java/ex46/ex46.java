package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static ex46.fileReader.readFileIntoString;
import static ex46.wordCounter.getWordFrequency;
public class ex46 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";
        String fileContent = null;
        try {
            fileContent = readFileIntoString(filePath, StandardCharsets.UTF_8); //Reads in file as one string
            fileContent = fileContent.replaceAll("(\\r\\n\\t)", " "); //Avoiding new lines, tabs...
            fileContent = fileContent.replaceAll("\\s+"," ").trim(); }
        catch (IOException e) {
            e.printStackTrace(); }
        assert fileContent != null;
        getWordFrequency(fileContent); }
}