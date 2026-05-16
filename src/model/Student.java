package model;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public double getGrade() {

        return grade;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStatus() {
        if (grade >= 75) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public void introduce() {
        System.out.println(
                "Hi I'm " + name +
                ", Grade: " + grade +
                ", Status: " + getStatus()
        );
    }
}


