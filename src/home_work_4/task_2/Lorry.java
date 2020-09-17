package home_work_4.task_2;

public class Lorry extends Car {
    private final double capacity;

    public Lorry(String carModel, String carClass, double weight, double capacity, Engine engine) {
        super(carModel, carClass, weight, engine);
        this.capacity = capacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println("Грузоподъемность: " + capacity);
        System.out.println("Марка автомобиля: " + super.carModel);
        System.out.println("Класс автомобиля: " + super.carClass);
        System.out.println("Вес автомобиля: " + super.weight);
        System.out.println("Мощность: " + super.engine.getPower());
        System.out.println("Производитель мотора: " + super.engine.getManufacturer());
    }
}
