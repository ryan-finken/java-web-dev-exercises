package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;

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

        System.out.println(menu);
        System.out.println(menu.getItem("grilled cheese"));

    }
}
