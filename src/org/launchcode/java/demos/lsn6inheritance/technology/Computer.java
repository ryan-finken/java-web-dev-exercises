package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer {
    private boolean isOn = false;
    private boolean hasNewNotifications = false;
    private String notification;

    public Computer() {
    }

    public Computer(String message) {
        hasNewNotifications = true;
        notification = message;
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
}
