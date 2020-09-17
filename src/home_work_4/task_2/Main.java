package home_work_4.task_2;

public class Main {

    public static void main(String[] args) {
        Car lorry = new Lorry(
                "КАМАЗ",
                "бортовой самосвал",
                7800,
                5000,
                new Engine(180, "КАМАЗ")
        );

        Car sportCar = new SportCar(
                "Subaru BRZ",
                "заднеприводный спорткар",
                1200,
                250,
                new Engine(200, "Toyota")
        );

        for (Car car : new Car[]{lorry, sportCar}) {
            car.printInfo();
        }
    }
}
