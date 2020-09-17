package home_work_4.task_1;

public class Main {
    public static void main(String[] args) {
        Shape[] figure = new Shape[3];
        figure[0] = new Triangle(30, 40, 50, "треугольника");
        figure[1] = new Circle(10, "круга");
        figure[2] = new Rectangle(15, 20, "прямоугольника");
        Shape[] figures = new Shape[]{figure[0], figure[1], figure[2]};
        for (Shape shape : figures) {
            if (shape instanceof Triangle) {
                System.out.print("Площадь " + ((Triangle) shape).getName() + ": ");
            }
            if (shape instanceof Circle) {
                System.out.print("Площадь " + ((Circle) shape).getName() + ": ");
            }
            if (shape instanceof Rectangle) {
                System.out.print("Площадь " + ((Rectangle) shape).getName() + ": ");
            }
            System.out.println(shape.square());
        }
    }
}
