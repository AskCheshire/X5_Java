package home_work_3.animal;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Кошка", "Вискас", "в коробке");
        Animal dog = new Dog("Пёс", "косточку", "на диване");
        Animal horse = new Horse("Лошадь", "сено", "в конюшне");
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
