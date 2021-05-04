package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static LocalDate lastUpdated;
    private HashMap<String, MenuItem> items;

    public Menu() {
        lastUpdated = LocalDate.of(1900, 1, 1);
        items = new HashMap<>();
    }

    public static LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void addItem(MenuItem item) {
        items.put(item.getCategory().toLowerCase(), item);
        if (item.getItemDebut().compareTo(lastUpdated) >= 0) {
            lastUpdated = item.getItemDebut();
        }

    }

    public void removeItem(String name) {
        items.remove(name.toLowerCase());
    }

    public MenuItem getItem(String name) {
        return items.get(name);
    }

    public String toString() {
        String mainCourses = "--------------- Main Courses ---------------\n";
        String appetizers = "--------------- Appetizers ---------------\n";
        String desserts = "--------------- Desserts ---------------\n";
        String output = "--------------- Last updated: " + lastUpdated + " ---------------\n";

        for (Map.Entry<String, MenuItem> entry : items.entrySet()) {
            if (entry.getValue().getCategory().equals("appetizer")) {
                appetizers += entry.getValue();
            } else if (entry.getValue().getCategory().equals("main course")) {
                mainCourses += entry.getValue();
            } else if (entry.getValue().getCategory().equals("dessert")) {
                desserts += entry.getValue();
            }
        }
        output += appetizers + mainCourses + desserts;
        return output;
    }
}
