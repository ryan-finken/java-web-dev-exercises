package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private Double price;
    private LocalDate itemDebut;

    public MenuItem(String name, String description, String category, Double price, LocalDate menuDebut) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.itemDebut = menuDebut;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getItemDebut() {
        return itemDebut;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        if (this.itemDebut.compareTo(Menu.getLastUpdated()) >= 0) {
            return "------------------NEW!------------------\n"
                    + name + " --- " + price + "\n"
                    + description + "\n"
                    + "----------------------------------------\n";
        } else {
            return "----------------------------------------\n"
                    + name + " --- " + price + "\n"
                    + description + "\n"
                    + "----------------------------------------\n";
        }
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        MenuItem aMenuItem = (MenuItem) o;
        return aMenuItem.getName().toLowerCase().equals(getName().toLowerCase());
    }
}
