package home_work_4.task_1;

public class Rectangle implements Shape {
    private final double a;
    private final double b;
    private String name;

    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public double square() {
        return a * b;
    }

    public String getName() {
        return name;
    }
}
