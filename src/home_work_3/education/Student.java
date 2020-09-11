package home_work_3.education;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

}
