package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gianni Angelone
 */
import org.junit.jupiter.api.Test;
import static ex43.websiteMaker.websiteWriter;
import static org.junit.jupiter.api.Assertions.*;
class ex43test {
    @Test
    void main() {
        String siteName = "awesomeco";
        String author = "Max Power";
        String js1 = "y";
        String css1 = "y";
        char js = js1.charAt(0);
        char css = css1.charAt(0);
        assertNotEquals("Website was not created.", websiteWriter(siteName, author, js, css)); }
}