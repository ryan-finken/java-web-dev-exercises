package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise1 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String studentName;

        do {
            System.out.print("Enter student name: ");
            studentName = in.nextLine();
            if (!studentName.equals("")) {
                System.out.print("Enter student ID: ");
                Integer id = in.nextInt();
                students.put(id, studentName);
                in.nextLine();
            }
        } while (!studentName.equals(""));

        in.close();

        System.out.println("-- Student Roster --");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("id: " + student.getKey() + " student: " + student.getValue());
        }
    }
}
