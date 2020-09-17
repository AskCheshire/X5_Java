package home_work_4.task_1;

public class Circle implements Shape {
    private final int R;
    private String name;

    public Circle(int R, String name) {
        this.R = R;
        this.name = name;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(R, 2);
    }
    public String getName() {
        return name;
    }
}
