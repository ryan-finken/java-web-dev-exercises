package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private Teacher teacher;
    private String courseName;
    private HashMap<Student, Integer> gradeBook = new HashMap<>();

    public Course(Teacher aTeacher, String aCourseName) {
        teacher = aTeacher;
        courseName = aCourseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public String getCourseName() {
        return courseName;
    }
    public HashMap getGradeBook() {
        return gradeBook;
    }
    public int getStudentGrade(Student student) {
        if (!gradeBook.containsKey(student)) {
            return -1;
        } else {
            return gradeBook.get(student);
        }
    }

    public void addStudentEntry(Student student, Integer grade) {
        gradeBook.put(student, grade);
    }
    public String toString() {
        String message =
                "------------------------------\n"
                + courseName + "\n"
                + "------------------------------\n"
                + teacher.getName() + "\n"
                + "------------------------------\n"
                + "       Student grades         \n"
                + "------------------------------\n";

        for (Map.Entry<Student, Integer> entry : gradeBook.entrySet()) {
            message += "student: " + entry.getKey().getName() + " grade: " + entry.getValue() + "\n";
        }


        return message;
    }
}
