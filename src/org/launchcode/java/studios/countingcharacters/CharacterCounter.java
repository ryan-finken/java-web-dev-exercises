package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CharacterCounter {
    public static void main(String[] args) {
        String text = "";
        try {
            File readIn = new File("/Users/ryanfinken/lc101/java-practice/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/test.txt");
            Scanner in = new Scanner(readIn);
            while (in.hasNextLine()) {
                text += in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // convert to lower case
        text = text.toLowerCase();

        // split into string array, removing non-alpha characters, then stitch back together
        String[] removeBadChars = text.split("\\W+");
        text = "";
        for (String phrase: removeBadChars) {
            text += phrase;
        }

        // convert string to character array
        char[] charsInText = text.toCharArray();

        // create hashmap with key of type Char, value of type Integer
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // loop through char array
            // if char is not in hashmap, create entry of char:1
            // else, increment value mapped to char by 1
        for (char character : charsInText) {
            if (! characterCounts.containsKey(character)) {
                characterCounts.put(character, 1);
            } else {
                int count = characterCounts.get(character) + 1;
                characterCounts.put(character, count);
            }
        }

        // loop through hashmap, print 1 key:value per line
        for (Map.Entry<Character, Integer> charCount : characterCounts.entrySet()) {
            System.out.println(charCount.getKey() + " : " + charCount.getValue());
        }
    }
}
