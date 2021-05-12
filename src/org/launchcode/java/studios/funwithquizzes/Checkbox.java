package org.launchcode.java.studios.funwithquizzes;

public class Checkbox extends Question {
    AnswerChoices choices;

    public Checkbox(String prompt, AnswerChoices choices, String correctAnswer) {
        super(prompt, correctAnswer);
        this.choices = choices;
    }

    public boolean compareAnswers() {
        if (getUserAnswer().length() != getCorrectAnswer().length()) {
            return false;
        } else {
            for (int i = 0; i < getUserAnswer().length(); i++) {
                if (getCorrectAnswer().toLowerCase().indexOf(getUserAnswer().toLowerCase().charAt(i)) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return getPrompt() + "\n" + "*select ALL that apply*" + "\n" + choices;
    }
}
