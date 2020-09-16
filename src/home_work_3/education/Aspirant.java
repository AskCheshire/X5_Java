package home_work_3.education;

public class Aspirant extends Student {
    private String diplom;

    public Aspirant(String firstName, String lastName, int group, int averageMark, String diplom) {
        super(firstName, lastName, group, averageMark);
        this.diplom = diplom;
    }

    @Override
    public int getScholarship() {
        return super.averageMark == 5 ? 200 : 180;
    }
}
