package home_work_4.task_1;

public class Triangle implements Shape {
    private final int a;
    private final int b;
    private final int c;
    private String name;

    public Triangle(int a, int b, int c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    private double p() {
        return (double) (a + b + c) / 2;
    }

    @Override
    public double square() {
        double square = Math.sqrt(p() * (p() - a) * (p() - b) * (p() - c));
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Это не треугольник");
            System.exit(0);
        }
        return square;
    }

    public String getName() {
        return name;
    }
}
