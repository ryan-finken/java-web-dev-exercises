package exercises.ch3;

import java.util.Arrays;

public class ArrayExercise1 {
    public static void main(String[] args) {
//        int[] numbers = {1, 1, 2, 3, 5, 8};
//        for (int i : numbers) {
//            System.out.println(i);
//        }
//        for (int i : numbers) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = poem.split(" ");
//        for (String word : words) {
//            System.out.println(word);
//        }
//        System.out.println(Arrays.toString(words));
        String[] sentences = poem.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] += ".";
        }
        System.out.println(Arrays.toString(sentences));
    }
}
