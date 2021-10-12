package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Use scanner to read in file
//Use FileWriter for output file
public class nameSorter {
    public static void namesReader(Scanner input, ArrayList<String> names) { //Here we loop through the names
        while (input.hasNextLine()) {
            names.add(input.nextLine());}
    }
    public static void namesOutput(ArrayList<String> names) throws IOException {
        FileWriter output = new FileWriter("exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");
        for (String i : names) {
            output.write(i + "\n");} //Printing out names
        output.close();
    }
}