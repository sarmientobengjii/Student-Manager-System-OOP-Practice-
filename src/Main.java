import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter grade: ");
        double grade = scanner.nextDouble();

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