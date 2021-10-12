package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static ex42.dataPrinter.dataPrint;
import static org.junit.jupiter.api.Assertions.*;
class ex42test {
    @Test
    void main() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt"));
        assertNotEquals("Error, file not found!", dataPrint(inputFile));
    }
}