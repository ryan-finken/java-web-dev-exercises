package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String aTopic, Teacher aTeacher, ArrayList<Student> someStudents) {
        topic = aTopic;
        instructor = aTeacher;
        enrolledStudents = someStudents;
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        String header = "*** Course: " + topic + " *** Instructor: " + instructor + " ***\n";
        String studentBlock = "";
        String footer = "***----------------------------------------------***";

        for (Student student : enrolledStudents) {
            studentBlock += "* " + student + " *\n";
        }

        return header + studentBlock + footer;
    }
    public boolean equals(Object aCourse) {
        if (aCourse == this) {
            return true;
        }
        if (aCourse == null) {
            return false;
        }
        if (getClass() != aCourse.getClass()) {
            return false;
        }
        Course comparisonCourse = (Course) aCourse;
        if (comparisonCourse.getInstructor() != getInstructor()) {
             return false;
        }
        if (comparisonCourse.getTopic() != getTopic()) {
            return false;
        }
        if (! comparisonCourse.getEnrolledStudents().equals(getEnrolledStudents())) {
            return false;
        }
        return true;
    }

}
