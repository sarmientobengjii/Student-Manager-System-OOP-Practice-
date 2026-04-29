import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter grade: ");
        double grade = scanner.nextDouble();

        //WHILE LOOP
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            //SAFE HANDLING AND SCALABLE LOGIC
            if (choice == 1) {
                System.out.println("Adding Student...");
            } else if (choice == 2) {
                System.out.println("Viewing Students...");
            } else if (choice == 3) {
                running = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        Student s;

        if (grade >= 90) {
            s = new HonorStudent(name, grade);
        } else if (grade < 75) {
            s = new FailingStudent(name, grade);
        } else {
            s = new Student(name, grade);
        }

        s.introduce();
    }
}

