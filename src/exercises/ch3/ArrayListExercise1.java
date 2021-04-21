package exercises.ch3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        List<String> wordsAsAL = new ArrayList<String>();
        String csv = "This,is,a,list,of,words";
        String[] words = csv.split(",");
        wordsAsAL = Arrays.asList(words);
        System.out.println(wordsAsAL);
        ArrayList<String> fivers = getNLetterWords(wordsAsAL, 1);
        System.out.println(fivers);

    }

    private static int getSumOfEvens(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    private static ArrayList<String> getFiveLetterWords(ArrayList<String> words) {
        ArrayList<String> fivers = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 5) {
                fivers.add(word);
            }
        }
        return fivers;
    }

    private static ArrayList<String> getNLetterWords(List<String> words, int number) {
        ArrayList<String> numberLengthWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == number) {
                numberLengthWords.add(word);
            }
        }
        return numberLengthWords;
    }
}
