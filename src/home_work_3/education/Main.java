package home_work_3.education;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванцов", 5, 5);
        Student aspirant = new Aspirant("Юрий", "Семёнов", 1, 4, "сдан");
        Student aspirant1 = new Aspirant("Анна", "Петрова", 1, 5, "не сдан");
        Student[] students = new Student[]{student, aspirant, aspirant1};
        for (Student i : students) {
            System.out.println(i.getFirstName() + " " + i.getLastName() + ", группа " + i.getGroup() + ", оценка: " + i.getAverageMark() + ", стипендия: " + i.getScholarship() + "$");
        }
    }

}
