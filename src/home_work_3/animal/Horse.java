package home_work_3.animal;

public class Horse extends Animal {
    private static final String name = "Лошадь";

    public Horse() {
        super("сено", "в конюшне");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " ржёт");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    public String getName() {
        return name;
    }
}
