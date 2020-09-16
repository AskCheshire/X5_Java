package home_work_3.animal;

public class Animal {
    private String food;
    private String location;
    protected String name;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное шумит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    public void sleep() {
        System.out.println(name + " спит " + location);
    }

}
