package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ex41test {
    @Test
    void namesReader() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<>();
        nameSorter.namesReader(inputFile, names);
        int size = names.toArray().length;
        assertEquals(7, size); }
}