package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
public class dataPrinter {
    public static Object dataPrint(Scanner input) {
        while (input.hasNextLine()) {
            String s = input.nextLine();
            String[] temp = s.split(","); //Loops over reading in file, then separates information
            System.out.printf("%-10s%-10s%-10s\n", temp[0], temp[1], temp[2]);}
        return null;}
}