package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1984, 3, 13);
        LocalDate marksBirthday = LocalDate.of(1986, 1, 21);

        MenuItem grilledCheese = new MenuItem(
                "Grilled Cheese",
                "Cheddar cheese on whole wheat bread, grilled to melty perfection",
                "main course",
                5.99,
                myBirthday
        );
        MenuItem softPretzel = new MenuItem(
                "Soft Pretzel",
                "Bavarian-style soft pretzel with kosher salt",
                "appetizer",
                2.99,
                myBirthday
        );
        MenuItem cheesecake = new MenuItem(
                "New York Style Cheesecake",
                "Cheesecake on a graham cracker crust with glazed strawberries",
                "dessert",
                5.99,
                marksBirthday
        );

        Menu menu = new Menu();
        menu.addItem(grilledCheese);
        menu.addItem(cheesecake);
        menu.addItem(softPretzel);

        System.out.println(menu); // implicitly calls toString method on menu
        System.out.println(menu.getItem("new york style cheesecake")); // get MenuItem by name
        System.out.println(grilledCheese.equals(grilledCheese)); // reference check
        System.out.println(grilledCheese.equals(cheesecake)); // should be false

        MenuItem anotherSandwich = new MenuItem(
                "grilled cheese",
                "doesn't matter",
                "doesn't matter",
                0.0,
                LocalDate.of(1900, 1, 1)
        );

        System.out.println(grilledCheese.equals(anotherSandwich)); // should be true

        menu.removeItem("grilled cheese");
        MenuItem pastaAlfredo = new MenuItem(
                "Pasta Alfredo",
                "Fettucine with a cream and parmesan cheese sauce",
                "main course",
                11.99,
                LocalDate.of(2021, 5, 4)
        );
        menu.addItem(pastaAlfredo);
        System.out.println(menu);
    }
}
