package home_work_3.education;

public class Aspirant extends Student {

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    int getScholarship() {
        return super.averageMark == 5 ? 200 : 180;
    }
}
