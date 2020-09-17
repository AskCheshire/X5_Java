package home_work_4.task_2;

public abstract class Car {
    static final String TURN_RIGHT = "Поворот направо";
    static final String TURN_LEFT = "Поворот налево";
    protected final String carModel;
    protected final String carClass;
    protected final double weight;
    protected final Engine engine;

    public Car(String carModel, String carClass, double weight, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();

    abstract void stop();

    public void turnRight() {
        System.out.println(TURN_RIGHT);
    }

    public void turnLeft() {
        System.out.println(TURN_LEFT);
    }

    abstract void printInfo();
}
