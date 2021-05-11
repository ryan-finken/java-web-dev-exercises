package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {

    private String prompt;
    private String correctAnswer;
    private String userAnswer;

    public Question(String prompt, String correctAnswer) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public abstract boolean compareAnswers();
    public abstract String toString();
}
