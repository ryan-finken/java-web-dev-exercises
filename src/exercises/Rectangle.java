package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area + ".");
    }
}
