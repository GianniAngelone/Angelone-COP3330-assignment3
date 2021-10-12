package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//The scanner scans for a JSON file
public class productSearch {
    public static int productSearcher(String input, JSONArray subjects) {
        int count = 0;
        for (Object subject : subjects) {
            JSONObject json = (JSONObject) subject; //Will search through JSON object.
            String name = (String) json.get("name");
            if (input.equalsIgnoreCase(name)) { //If json object equals name, then it will display the results
                System.out.println("Name: " + name);
                System.out.println("Price: " + json.get("price"));
                System.out.println("Quantity: " + json.get("quantity"));
                count = 1;
                break; }
        }
        return count; }
}
