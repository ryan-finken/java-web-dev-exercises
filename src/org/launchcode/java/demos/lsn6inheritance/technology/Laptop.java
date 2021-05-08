package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {
    public Laptop() {
        super();
    }

    public Laptop(String message) {
        super(message);
    }

    public void openExcel() {
        if (this.powerStatus()) {
            System.out.println("Opening excel...");
        } else {
            System.out.println("Power is off.");
        }
    }
}
