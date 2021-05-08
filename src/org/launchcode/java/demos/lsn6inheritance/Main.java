package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat hugo = new HouseCat("Hugo", 25.0);
        hugo.sleep();
        System.out.println(hugo.noise());
    }
}
