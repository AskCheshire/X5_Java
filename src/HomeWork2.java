import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
//1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
        System.out.println(" *** \n\nЗадание 1.\nДанная программа принимает на ввод целое число и выводит его последнюю цифру");
        System.out.print("Введите число: ");
        Scanner Task1 = new Scanner(System.in);
        int numberTask1 = Task1.nextInt();
        int lastInt = numberTask1 % 10;
        System.out.println("Последняя цифра числа " + numberTask1 + ": " + lastInt + "\n\n ***");
//2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println(" *** \n\nЗадание 2.\nДанная программа принимает на ввод целое трехзначное число и выводит сумму его цифр");
        System.out.print("Введите целое трехзначное число: ");
        Scanner Task2 = new Scanner(System.in);
        int numberTask2 = Task2.nextInt();
        int sumInt = numberTask2 % 100 / 10 + numberTask2 / 100 + numberTask2 % 10;
        System.out.println("Сумма цифр числа " + numberTask2 + ": " + sumInt + "\n\n ***");
//3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.
        System.out.println(" *** \n\nЗадание 3.\nДанная программа принимает на ввод целое число. Если число положительное, то прибавляет к нему 1 и выводит результат, в противном случае просто выводит полученное число.");
        for (int i = 0; i < 2; i++) { //2 цикла для проверки всех значений
            System.out.print("Введите целое число: ");
            Scanner Task3 = new Scanner(System.in);
            int numberTask3 = Task3.nextInt();
            if (numberTask3 > 0) {
                numberTask3 += 1;
                System.out.println("Введено положительное число, результат работы программы: " + numberTask3 + "\n\n ***");
            } else {
                System.out.println("Введено не положительное число, результат работы программы: " + numberTask3 + "\n\n ***");
            }
//4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
            System.out.println(" *** \n\nЗадание 4.\nДанная программа принимает на ввод целое число. Если число положительное, то прибавляет к нему 1 и выводит результат, если отрицательным - вычитает из него 2 и выводит результат, если нулевым - меняет его на 10");
            for (int a = 0; a < 3; a++) { //3 цикла для проверки всех значений
                System.out.print("Введите целое число: ");
                Scanner Task4 = new Scanner(System.in);
                int numberTask4 = Task4.nextInt();
                if (numberTask4 > 0) {
                    numberTask4 += 1;
                    System.out.println("Введено положительное число, результат работы программы: " + numberTask4);
                } else if (numberTask4 < 0) {
                    numberTask4 = numberTask4 - 2;
                    System.out.println("Введено отрицательное число, результат работы программы: " + numberTask4 + "\n\n ***");
                } else {
                    numberTask4 = 10;
                    System.out.println("Введено нулевое число, результат работы программы: " + numberTask4 + "\n\n ***");
                }
            }
//5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
            System.out.println(" *** \n\nЗадание 5.\nДанная программа принимает на ввод три целых числа и выводит наименьшее из них.");
            for (int b = 0; b < 5; b++) { //5 циклов для проверки всех значений
                System.out.println("Последовательно ведите три целых числа, после ввода каждого нажимая Enter: ");
                Scanner Task5 = new Scanner(System.in);
                int[] numberTask5 = {Task5.nextInt(), Task5.nextInt(), Task5.nextInt()};
                if (numberTask5[0] <= numberTask5[1] && numberTask5[0] <= numberTask5[2]) {
                    System.out.println("Наименьшее число: " + numberTask5[0]);
                } else if (numberTask5[1] <= numberTask5[0] && numberTask5[1] <= numberTask5[2]) {
                    System.out.println("Наименьшее число: " + numberTask5[1]);
                } else if (numberTask5[2] <= numberTask5[0] && numberTask5[2] <= numberTask5[1]) {
                    System.out.println("Наименьшее число: " + numberTask5[2]);
                }
            }
        }
//6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.
        System.out.println(" *** \n\nЗадание 6.\nДанная программа принимает на ввод целое число и выводит его описание.");
        for (int i = 0; i < 5; i++) { //5 циклов для проверки всех значений
            Scanner Task6 = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            int numberTask6 = Task6.nextInt();
            if (numberTask6 % 2 == 0 && numberTask6 < 0) {
                System.out.println("Число " + numberTask6 + " - отрицательное чётное");
            } else if (numberTask6 % 2 == 0 && numberTask6 > 0) {
                System.out.println("Число " + numberTask6 + " - положительное чётное");
            } else if (numberTask6 % 2 != 0 && numberTask6 < 0) {
                System.out.println("Число " + numberTask6 + " - отрицательное нечётное");
            } else if (numberTask6 % 2 != 0 && numberTask6 > 0) {
                System.out.println("Число " + numberTask6 + " - положительное нечётное");
            } else if (numberTask6 == 0) {
                System.out.println("Число " + numberTask6 + " - ноль!");
            }
        }
//7. Написать программу, вычисляющую стоимость 10-минутного междугороднего разговора в зависимости от кода города. ( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00 руб. ). Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
        System.out.println(" *** \n\nЗадание 7.\nДанная программа принимает на ввод код города (Москва(905), Ростов(194), Краснодар(491), Киров(800) и выводит стоимость 10 минут разговора с городом с указанным кодом");
        for (int i = 0; i < 5; i++) { //5 циклов для проверки всех значений
            Scanner Task7 = new Scanner(System.in);
            System.out.println("\nВведите код города:\nМосква - 905\nРостов - 194\nКраснодар - 491\nКиров - 800");
            int numberTask7 = Task7.nextInt();
            int timeTalk = 10;
            double priceMoscow = 4.15;
            double priceRostov = 1.98;
            double priceKrasnodar = 2.69;
            double priceKirov = 5.00;
            switch (numberTask7) {
                case (905):
                    System.out.println("Москва. Стоимость разговора:" + timeTalk * priceMoscow + "руб.");
                    break;
                case (194):
                    System.out.println("Ростов. Стоимость разговора:" + timeTalk * priceRostov + "руб.");
                    break;
                case (491):
                    System.out.println("Краснодар. Стоимость разговора:" + timeTalk * priceKrasnodar + "руб.");
                    break;
                case (800):
                    System.out.println("Киров. Стоимость разговора:" + timeTalk * priceKirov + "руб.");
                    break;
                default:
                    System.out.println("Вы ввели неверный код города");
                    break;
            }
        }
    }
}