package home_work_3.animal;

public class Horse extends Animal {
    private String name;

    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " ржёт");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + getFood());
    }

    public String getName() {
        return name;
    }
}
