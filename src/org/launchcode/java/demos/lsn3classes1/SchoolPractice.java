package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student ryan = new Student("Ryan", 100, 1, 4.0);
        Student zoe = new Student("Zoe");
        Student loretta = new Student("Loretta");
        Student hugo = new Student("Hugo");
        Student miles = new Student("Miles");
        Student leia = new Student("Leia");
        Student goose = new Student("Goose");
        Student cricket = new Student("Cricket");

        Student[] students = {ryan, zoe, loretta, hugo, miles, leia, goose, cricket};
        for (Student student : students) {
            System.out.println("-------------");
            System.out.println("name: " + student.getName());
            System.out.println("id: " + student.getStudentId());
            System.out.println("# of credits: " + student.getNumberOfCredits());
            System.out.println("gpa: " + student.getGpa());
            System.out.println("-------------");
        }

        Teacher corey = new Teacher("Corey", "Stevens", "Sociology", 7);
        System.out.println(corey.getName() + " subject: " + corey.getSubject() + " years teaching: " + corey.getYearsTeaching());

        Course intro = new Course(corey, "Medical Sociology");
        int firstGrade = 1;
        for (Student student : students) {
            intro.addStudentEntry(student, firstGrade);
            firstGrade++;
        }
        System.out.println(intro);
    }
}
