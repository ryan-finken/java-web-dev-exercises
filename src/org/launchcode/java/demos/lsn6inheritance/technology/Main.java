package org.launchcode.java.demos.lsn6inheritance.technology;

public class Main {
    public static void main(String[] args) {
        SmartPhone iphone6 = new SmartPhone();
        System.out.println(iphone6.getNotification()); // should say power is off
        iphone6.powerUp();
        System.out.println(iphone6.powerStatus()); // should say true
        System.out.println(iphone6.getNotification()); // should say no new notifications

        SmartPhone iphone7 = new SmartPhone("SLAAAAACK");
        iphone7.powerUp();
        System.out.println(iphone7.getNotification()); // SLAAAAAAAAAACK!!!!!!
        System.out.println(iphone7.callFriend("Terry")); // calling terry...

        Laptop m1 = new Laptop("Test...");
        m1.powerUp();
        System.out.println("Power on? " + m1.powerStatus());
        System.out.println(m1.getNotification()); // Test...
        m1.openExcel(); // Opening excel...
    }
}
