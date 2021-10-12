package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static ex45.fileEditor.editedFileOutput;
public class ex45 {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Desired output file name: "); //Asks user for a name to give the output file
        String output_file_name = userInput.nextLine();
        Scanner inputFile = new Scanner(new File("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex45\\exercise45_input.txt"));
        String text;
        StringBuilder sb = new StringBuilder();
        while (inputFile.hasNextLine()) {
            text = inputFile.nextLine(); //Scans the next lines
            sb.append("\n").append(text); }
        String contents = sb.toString();
        editedFileOutput(output_file_name, contents);
        inputFile.close(); }
}