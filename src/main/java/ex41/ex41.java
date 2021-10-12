package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Sort alphabetically using CASE_INSENSITIVE_ORDER
public class ex41 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        //Here we declare the array
        ArrayList<String> names = new ArrayList<>();
        nameSorter.namesReader(inputFile, names);
        names.sort(String.CASE_INSENSITIVE_ORDER);
        inputFile.close();
        try {
            nameSorter.namesOutput(names);}
        //If there is an exception case
        catch (Exception e) {
            System.out.println(e);}
    }
}

