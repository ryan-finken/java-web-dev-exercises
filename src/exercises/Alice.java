package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String introToWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term for search:");
        String query = input.next().toLowerCase();
        input.close();

        int index = introToWonderland.toLowerCase().indexOf(query);
        if (index > -1) {
            int length = query.length();
            System.out.println(
                    "Query: "
                    + query
                    + " is "
                    + length
                    + " characters long and "
                    + " was found at index: "
                    + index
                    + "."
            );

            introToWonderland = introToWonderland.substring(0, index)
                    + introToWonderland.substring(index + length, introToWonderland.length() - 1);

            System.out.println(introToWonderland);


        } else {
            System.out.println("Search term not found.");
        }
    }
}
