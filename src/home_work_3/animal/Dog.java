package home_work_3.animal;

public class Dog extends Animal {
    private static final String name = "Пёс";

    public Dog() {
        super("косточку", "на диване");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " гавкает");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    public String getName() {
        return name;
    }
}

