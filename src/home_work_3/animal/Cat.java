package home_work_3.animal;

public class Cat extends Animal {
    private static final String name = "Кошка";

    public Cat() {
        super("вискас", "в коробке");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    public String getName() {
        return name;
    }
}
