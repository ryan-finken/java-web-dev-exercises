package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        double gallons = input.nextDouble();
        input.close();

        double mpg = miles / gallons;
        System.out.println(
                "Your average mpg was "
                + mpg
                + " miles per gallon."
        );
    }
}
