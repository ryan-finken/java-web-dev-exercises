package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits < 30) {
            return "Freshman";
        } else if (numberOfCredits < 60) {
            return "Sophomore";
        } else if (numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = getGpa() * getNumberOfCredits();
        double courseQualityScore = grade * courseCredits;
        double totalQualityScore = currentQualityScore + courseQualityScore;
        numberOfCredits += courseCredits;
        gpa = totalQualityScore / getNumberOfCredits();
    }

    public String toString() {
        return "Name: " + name + " | Id: " + studentId + " | GPA: " + gpa;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
             return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        Student otherSally = new Student("S. Fields", 1, 1, 4.0);
        if (sally.equals(otherSally)) {
            System.out.println("You got Sallys!");
        }
        Student notASally = new Student("Ryan", 10,1,1);
        if (! sally.equals(notASally)) {
            System.out.println("One of these is not a Sally");
        }

        Teacher corey = new Teacher("Corey", "Stevens", "Medical Sociology", 7);
        Student ryan = new Student("Ryan Finken", 1, 1, 4.0);
        Student zoe = new Student("Zoe Stinken", 2, 1, 4.0);
        Student miles = new Student("Miles Smiles", 3, 1, 4.0);
        Student hugo = new Student("Hugo Boss", 4, 1, 4.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(ryan);
        students.add(zoe);
        students.add(miles);
        students.add(hugo);

        Course intro = new Course("Intro to Sociology", corey, students);
        System.out.println(intro);

        // reference check
        if (intro.equals(intro)) {
            System.out.println("Reference check passes");
        }
        Course anotherIntro = new Course("Intro to Sociology", corey, students);
        if (anotherIntro.equals(intro)) {
            System.out.println("Wow!");
        }
    }
}
