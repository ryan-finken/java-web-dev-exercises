package org.launchcode.java.studios.funwithquizzes;

public class TrueFalse extends Question {

    public TrueFalse(String prompt, String correctAnswer) {
        super(prompt, correctAnswer);
    }

    public boolean compareAnswers() {
        return getCorrectAnswer().toLowerCase().equals(getUserAnswer().toLowerCase());
    }

    public String toString() {
        return "True or false: " + getPrompt();
    }
}
