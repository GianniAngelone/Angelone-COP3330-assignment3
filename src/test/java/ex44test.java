package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.io.IOException;
import static ex44.productSearch.productSearcher;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ex44test {
    @Test
    void main() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        String input = "Thing";
        Object obj = parser.parse(new FileReader("C:\\Users\\angel\\Desktop\\Angelone-COP3330-Assignment3\\src\\main\\java\\ex44\\exercise44_input.json"));
        JSONObject jsonObject = (JSONObject)obj;
        JSONArray subjects = (JSONArray)jsonObject.get("products");
        assertEquals(1, productSearcher(input,subjects));
    }
}