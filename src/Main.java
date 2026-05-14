import model.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(); //ARRAYLIST
        Scanner scanner = new Scanner(System.in); //Input/Output

        boolean running = true; //WHILE LOOP

        while (running) {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            //SAFE HANDLING AND SCALABLE LOGIC
            switch(choice) {
                case 1:
                    addStudent(scanner, students);
                    break;

                case 2:
                    viewStudents(students);
                    break;

                case 3:
                    searchStudent(scanner, students);
                    break;

                case 4:
                    running = false;
                    System.out.println("Program Terminated.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Exit");
    }

    public static void addStudent(Scanner scanner, ArrayList<Student> students) {

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
    }

    public static void viewStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students yet.");
        } else {
            for (Student s : students) {
                s.introduce();
            }
        }
    }

    public static void searchStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("Enter name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(searchName)) {
                s.introduce();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found! Please try again.");
        }
    }
}

