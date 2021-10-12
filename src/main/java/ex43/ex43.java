package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
//Takes input from user and creates a website skeleton of files
import static ex43.websiteMaker.websiteWriter;
public class ex43 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String author, siteName;
        char js, css;
        System.out.print("Site name: "); //Starting here we take user input
        siteName = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);
        websiteWriter(siteName, author, js, css);
        input.close();
    }
}

