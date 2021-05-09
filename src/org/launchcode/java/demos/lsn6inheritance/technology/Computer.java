package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends TechID {
    private boolean isOn = false;
    private boolean hasNewNotifications = false;
    private String notification;
    private static int nextID = 1;
    private int ID;


    public Computer() {
        assignNextID();
    }

    public Computer(String message) {
        hasNewNotifications = true;
        notification = message;
        assignNextID();
    }

    public void assignNextID() {
        ID = nextID;
        nextID++;
    }

    public void powerUp() {
        isOn = true;
    }

    public boolean powerStatus() {
        return isOn;
    }

    public String getNotification() {
        if (isOn) {
            if (hasNewNotifications) {
                return notification;
            } else {
                return "No new notifications.";
            }
        } else {
            return "Power is off.";
        }
    }

    public int getID() {
        return ID;
    }
}
