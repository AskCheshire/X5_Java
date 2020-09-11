package home_work_3.education;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(5);
        Student aspirant = new Aspirant(4);
        Student aspirant1 = new Aspirant(5);
        Student[] students = new Student[]{student, aspirant, aspirant1};
        for (Student i : students) {
            System.out.printf("Оценка %s: %d%n", i, i.getScholarship());
        }
    }

}
