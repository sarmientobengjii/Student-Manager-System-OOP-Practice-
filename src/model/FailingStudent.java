package model;

public class FailingStudent extends Student {

    public FailingStudent(String name, double grade) {
        super(name, grade);
    }

    @Override
    public String getStatus() {
        return "Needs Improvement";
    }
}
