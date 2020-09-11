package home_work_3.phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Phone firstPhone = new Phone("+7 (555) 55-55-5", "SGSN5", "100gr");
        Phone secondPhone = new Phone("+7 (666) 666-666", "SGSN6", "200gr");
        Phone thirdPhone = new Phone("+7 (777) 777-77-77", "SGSN7", "300gr");
        Phone fourthPhone = new Phone("+7 (888) 888-888-88", "SGSN8", "400gr");
        Phone fifthPhone = new Phone("+7 (999) 999-999-999", "SGSN9", "500gr");
        List<Phone> phones = new ArrayList<>();
        phones.add(firstPhone);
        phones.add(secondPhone);
        phones.add(thirdPhone);
        phones.add(fourthPhone);
        phones.add(fifthPhone);
        for (Phone phone : phones) {
            phone.receiveCall("Иван");
            System.out.println(phone.getNumber() + " " + phone.getModel() + " " + phone.getWeight());
        }

        firstPhone.receiveCall("Анна", "+7 (555) 55-55-5");
        firstPhone.sendMessage("+7 (666) 666-666", "+7 (777) 777-77-77", "+7 (888) 888-888-88", "+7 (999) 999-999-999");
    }
}
