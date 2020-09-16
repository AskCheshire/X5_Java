package home_work_3.education;

public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected int averageMark;

    public Student(String firstName, String lastName, int group, int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

}
