package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String aFirstName, String aLastName, String aSubject, int aYearsTeaching) {
        firstName = aFirstName;
        lastName = aLastName;
        subject = aSubject;
        yearsTeaching = aYearsTeaching;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public String getSubject() {
        return subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
