package org.launchcode.java.studios.funwithquizzes;

public class MultipleChoice extends Question {
    AnswerChoices choices;

    public MultipleChoice(String prompt, AnswerChoices choices, String correctAnswer) {
        super(prompt, correctAnswer);
        this.choices = choices;
    }

    public boolean compareAnswers() {
        return getCorrectAnswer().toLowerCase().equals(getUserAnswer().toLowerCase());
    }

    public String toString() {
        return getPrompt() + "\n" + choices;
    }
}
