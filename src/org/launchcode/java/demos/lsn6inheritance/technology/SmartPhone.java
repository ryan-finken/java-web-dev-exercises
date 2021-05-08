package org.launchcode.java.demos.lsn6inheritance.technology;

public class SmartPhone extends Computer {
    public SmartPhone(String message) {
        super(message);
    }

    public SmartPhone() {
        super();
    }

    public String callFriend(String friend) {
        if (this.powerStatus()) {
            return "Calling " + friend + "...";
        } else {
            return "Power is off.";
        }
    }
}
