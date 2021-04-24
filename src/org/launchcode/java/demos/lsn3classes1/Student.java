package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
        name = aName;
        studentId = aStudentId;
        numberOfCredits = aNumberOfCredits;
        gpa = aGpa;
    }
    public Student(String aName) {
        name = aName;
        studentId = nextId;
        nextId++;
    }

    // getter methods
    public String getName() {
        return this.name;
    }
    public int getStudentId() {
        return this.studentId;
    }
    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public double getGpa() {
        return this.gpa;
    }

    // setter methods
    public void setName(String aName) {
        name = aName;
    }
    private void setId(int aStudentId) {
        studentId = aStudentId;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

}