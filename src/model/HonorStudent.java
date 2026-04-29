package model;

public class HonorStudent extends Student {

    public HonorStudent(String name, double grade) {
        super(name, grade);
    }

    @Override
    public String getStatus() {
        if (getGrade() >= 90) {
            return "With Honors";
        } else {
            return super.getStatus();
        }
    }
}
