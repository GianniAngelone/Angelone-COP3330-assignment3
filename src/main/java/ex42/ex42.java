package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static ex42.dataPrinter.dataPrint;
//In this exercise, we take in the input file and call our dataPrint function
public class ex42 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt"));
        //Take and scan input file
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------"); //Organization purposes
        try{
            dataPrint(inputFile);}
        catch (Exception e) { //Exception case.
            System.out.println("Error, file not found!");}
        inputFile.close();
    }
}