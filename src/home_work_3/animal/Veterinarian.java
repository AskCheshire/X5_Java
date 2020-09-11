package home_work_3.animal;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + " кушает " + animal.getFood() + " и спит " + animal.getLocation());
    }
}
