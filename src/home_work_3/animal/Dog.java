package home_work_3.animal;

public class Dog extends Animal {
    private String name;

    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " гавкает");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + getFood());
    }

    public String getName() {
        return name;
    }
}

