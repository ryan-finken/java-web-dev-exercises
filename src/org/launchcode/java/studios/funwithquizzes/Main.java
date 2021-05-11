package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TrueFalse test1 = new TrueFalse("Ryan is very cool", "true");
        TrueFalse test2 = new TrueFalse("Corey is not cool at ALL", "false");
        TrueFalse test3 = new TrueFalse("Dogs are basically no work at all", "false");

        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Fritos");
        choices1.add("Cheetos");
        choices1.add("Ham");
        AnswerChoices answerChoices1 = new AnswerChoices(choices1);

        MultipleChoice test4 = new MultipleChoice(
                "Which of these foods is vegan?",
                answerChoices1,
                "a"
        );

        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("Apple Pie");
        choices2.add("Chocolate Cake");
        choices2.add("Ham");
        AnswerChoices answerChoices2 = new AnswerChoices(choices2);

        Checkbox test5 = new Checkbox(
                "Which of these foods is typically dessert?",
                answerChoices2,
                "ab"
        );

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(test1);
        questions.add(test2);
        questions.add(test3);
        questions.add(test4);
        questions.add(test5);

        Quiz quiz = new Quiz("Ryan's test quiz", questions);
        quiz.takeQuiz();
        System.out.println("You got "
                + quiz.getRightAnswers() + "/" + quiz.getTotalQuestions()
                + " questions right.");
    }
}
