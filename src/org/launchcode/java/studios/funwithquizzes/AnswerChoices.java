package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class AnswerChoices {
    ArrayList<String> choices;
    String letters = "abcdefghijklmnopqrstuvwxyz";

    public AnswerChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public String toString() {
        String output = "";
        for (String choice : choices) {
            output += letters.charAt(choices.indexOf(choice)) + ") " + choice + "\n";
        }
        output = output.substring(0, output.length() - 1); // remove last newline character
        return output;
    }
}
