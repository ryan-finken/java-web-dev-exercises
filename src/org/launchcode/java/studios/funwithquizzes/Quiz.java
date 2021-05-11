package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private String title;
    private ArrayList<Question> questions;
    private int totalQuestions;
    private int rightAnswers = 0;

    public Quiz(String title, ArrayList<Question> questions) {
        this.title = title;
        this.questions = questions;
        totalQuestions = questions.size();
    }

    public void takeQuiz() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        for (Question question : questions) {
            System.out.println("Question #" + (questions.indexOf(question) + 1));
            System.out.println(question);
            question.setUserAnswer(in.nextLine());
            if (question.compareAnswers()) {
                rightAnswers++;
            }
        }
        in.close();
    }

    public int getRightAnswers() {
        return rightAnswers;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}
