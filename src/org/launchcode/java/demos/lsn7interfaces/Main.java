package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        for (Flavor flavor : flavors) {
            System.out.println("flavor: " + flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }

        flavors.sort(new FlavorComparator());

        for (Flavor flavor : flavors) {
            System.out.println("flavor: " + flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }

        System.out.println("-------------");

        for (Topping topping : toppings) {
            System.out.println("topping: " + topping.getName());
        }

        System.out.println("--------------");

        toppings.sort(new ToppingComparator());

        for (Topping topping : toppings) {
            System.out.println("topping: " + topping.getName());
        }
    }
}
