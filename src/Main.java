import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(); //ARRAYLIST
        Scanner scanner = new Scanner(System.in); //Input/Output
        boolean running = true; //WHILE LOOP

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            //SAFE HANDLING AND SCALABLE LOGIC
            if (choice == 1) {

                System.out.println("Enter name: ");
                String name = scanner.nextLine();

                System.out.println("Enter grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();

                Student s;

                if (grade >= 90) {
                    s = new HonorStudent(name, grade);
                } else if (grade < 75) {
                    s = new FailingStudent(name, grade);
                } else {
                    s = new Student(name, grade);
                }

                students.add(s);

                System.out.println("Student Added!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students yet.");
                } else {
                    for (Student s : students) {
                        s.introduce();
                    }
                }
            } else if (choice == 3) {
                System.out.println("Program Terminated.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

