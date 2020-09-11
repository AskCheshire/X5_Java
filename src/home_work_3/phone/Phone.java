package home_work_3.phone;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщения будут оправлены на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
