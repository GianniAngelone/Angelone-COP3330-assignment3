package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import static ex44.productSearch.productSearcher;
//Reads JSON file and stores data, then prompts input from user to see if item exists in inventory.
public class ex44 {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            String input;
            Object obj = parser.parse(new FileReader("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex44\\exercise44_input.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int x;
            do {
                System.out.print("What is the product name? ");
                input = bufferedReader.readLine();
                x = productSearcher(input, subjects);
                if (x == 0) {
                    System.out.print("Sorry, that product was not found in our inventory.\n"); }
            }
            while (x != 1);
            {
                //Loops until a match is found
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace(); }
    }
}