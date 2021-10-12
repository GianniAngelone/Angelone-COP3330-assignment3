package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
//The fileReader scans, then creates and returns a string
public class fileReader {
    public static String readFileIntoString(String path, Charset encoding) throws IOException
    {
        String content;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            content = scanner.useDelimiter("\\A").next(); }
        return content; }
}