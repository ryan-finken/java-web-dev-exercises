package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        String radius = input.nextLine();
        while (! isValid(radius)) {
            System.out.println("Input must be numeric. Enter a radius:");
            radius = input.nextLine();
        }
        input.close();

        double area = Circle.getArea(Double.valueOf(radius));
        System.out.println(
                "The area of a circle with a radius of " +
                        radius +
                        " is: " +
                        area
        );
    }

    private static boolean isValid(String input) {
        if (input.equals("")) {
            return false;
        } else if (! isNumeric(input)) {
            return false;
        }
        return true;
    }

    private static boolean isNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) && input.charAt(i) != '.') {
                return false;
            }
        }
        return true;
    }
}
