package home_work_2;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        //Task7();
        //Task8();
        //Task9();
        //Task10();
    }

    static public void Task1() {
//1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
        System.out.println("\n *** \n\nЗадание 1.\nДанная программа принимает на ввод целое число и выводит его последнюю цифру");
        System.out.print("Введите число: ");
        Scanner Task1 = new Scanner(System.in);
        int numberTask1 = Task1.nextInt();
        int lastInt = numberTask1 % 10;
        System.out.println("Последняя цифра числа " + numberTask1 + ": " + lastInt);
    }

    static public void Task2() {
//2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println("\n *** \n\nЗадание 2.\nДанная программа принимает на ввод целое трехзначное число и выводит сумму его цифр");
        System.out.print("Введите целое трехзначное число: ");
        Scanner Task2 = new Scanner(System.in);
        int numberTask2 = Task2.nextInt();
        int sumInt = numberTask2 % 100 / 10 + numberTask2 / 100 + numberTask2 % 10;
        if (numberTask2 / 1000 != 0 || numberTask2 / 100 == 0) {
            System.out.println("Введёно не целое трёхзачное число!");
        } else {
            System.out.println("Сумма цифр числа " + numberTask2 + ": " + sumInt);
        }
    }

    static public void Task3() {
//3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.
        System.out.println("\n *** \n\nЗадание 3.\nДанная программа принимает на ввод целое число. Если число положительное, то прибавляет к нему 1 и выводит результат, в противном случае просто выводит полученное число.");
        System.out.print("Введите целое число: ");
        Scanner Task3 = new Scanner(System.in);
        int numberTask3 = Task3.nextInt();
        if (numberTask3 > 0) {
            numberTask3 += 1;
            System.out.println("Введено положительное число, результат работы программы: " + numberTask3);
        } else {
            System.out.println("Введено неположительное число, результат работы программы: " + numberTask3);
        }
    }

    static public void Task4() {
//4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
        System.out.println("\n *** \n\nЗадание 4.\nДанная программа принимает на ввод целое число. Если число положительное, то прибавляет к нему 1 и выводит результат, если отрицательным - вычитает из него 2 и выводит результат, если нулевым - меняет его на 10.");
        System.out.print("Введите целое число: ");
        Scanner Task4 = new Scanner(System.in);
        int numberTask4 = Task4.nextInt();
        if (numberTask4 > 0) {
            numberTask4 += 1;
            System.out.println("Введено положительное число, результат работы программы: " + numberTask4);
        } else if (numberTask4 < 0) {
            numberTask4 = numberTask4 - 2;
            System.out.println("Введено отрицательное число, результат работы программы: " + numberTask4);
        } else {
            numberTask4 = 10;
            System.out.println("Введено нулевое число, результат работы программы: " + numberTask4);
        }
    }

    static public void Task5() {
//5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
        System.out.println("\n *** \n\nЗадание 5.\nДанная программа принимает на ввод три целых числа и выводит наименьшее из них.");
        System.out.println("Последовательно ведите три целых числа, после ввода каждого нажимая Enter: ");
        Scanner Task5 = new Scanner(System.in);

        int[] numberTask5 = new int[3];
        for (int i = 0; i < 3; i++) {
            numberTask5[i] = Task5.nextInt();
        }
        int minNumberTask5 = numberTask5[0];
        for (int i = 1; i < numberTask5.length - 1; i++) {
            if (minNumberTask5 > numberTask5[i]) {
                minNumberTask5 = numberTask5[i];
            }
        }
        System.out.println("Наименьшее число: " + minNumberTask5);
    }

    static public void Task6() {
//6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.
        System.out.println("\n *** \n\nЗадание 6.\nДанная программа принимает на ввод целое число и выводит его описание.");
        Scanner Task6 = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int numberTask6 = Task6.nextInt();
        if (numberTask6 == 0) {
            System.out.println("Число" + numberTask6 + " - ноль!");
            return;
        }
        String numberTask6Info = "";
        if (numberTask6 > 0) {
            numberTask6Info += "положительное";
        } else {
            numberTask6Info += "отрицательное";
        }
        if (numberTask6 % 2 == 0) {
            numberTask6Info += " четное число";
        } else {
            numberTask6Info += " нечетное число";
        }
        System.out.println(numberTask6Info);
    }

    static public void Task7() {
//7. Написать программу, вычисляющую стоимость 10-минутного междугороднего разговора в зависимости от кода города. ( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00 руб. ). Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
        System.out.println("\n *** \n\nЗадание 7.\nДанная программа принимает на ввод код города (Москва(905), Ростов(194), Краснодар(491), Киров(800) и выводит стоимость 10 минут разговора с городом с указанным кодом.");
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

    static public void Task8() {
// 8. Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран: - максимальное значение - сумму положительных элементов - сумму четных отрицательных элементов - количество положительных элементов - среднее арифметическое отрицательных элементов
        System.out.println("\n *** \n\nЗадание 8.\nДанная программа выводит из массива чисел 1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2 следующие зачения:\n- максимальное значение\n- сумму положительных элементов\n- сумму чётных орицательных элементов\n- количество положительных элементов\n- среднее арифметическое отрицательных элементов");
        int[] numberTask8 = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int maxNumberTask8 = numberTask8[0];
        int sumOfPositiveNumberTask8 = 0;
        int sumOfNegativeEvenNumberTask8 = 0;
        int positiveCountNumberTask8 = 0;
        int sumOfNegativeNumberTask8 = 0;
        int negativeCountNumberTask8 = 0;
        for (
                int i : numberTask8) {
            if (i > maxNumberTask8) {
                maxNumberTask8 = i;
            }
            if (i > 0) {
                sumOfPositiveNumberTask8 += i;
                positiveCountNumberTask8++;
            } else {
                sumOfNegativeNumberTask8 += i;
                negativeCountNumberTask8++;
            }
            if (i < 0 && i % 2 == 0) {
                sumOfNegativeEvenNumberTask8 += i;
            }
            if (i == 0) {
                negativeCountNumberTask8 -= 1;
            }
        }
        System.out.println("\nРешение:");
        System.out.println("Максимальное значение числа из массива: " + maxNumberTask8);
        System.out.println("Сумма полжительных элементов массива: " + sumOfPositiveNumberTask8);
        System.out.println("Сумма чётных отрицательных элементов массива: " + sumOfNegativeEvenNumberTask8);
        System.out.println("Количество положительных элементов: " + positiveCountNumberTask8);
        System.out.println("Среднее арифмитическое отрицательных элементов массива: " + ((float) sumOfNegativeNumberTask8 / negativeCountNumberTask8));
    }

    static public void Task9() {
// 9. Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52]. Переставить элементы массива в обратном порядке. Вывести результат в консоль
        System.out.println("\n *** \n\nЗадание 9.\nДанная программа выводит массив чисел 15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52 в обратном порядке");
        int[] numberTask9 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] revertNumberTask9 = new int[numberTask9.length];
        for (
                int i = 0;
                i < numberTask9.length; i++) {
            revertNumberTask9[i] = numberTask9[numberTask9.length - 1 - i];
        }
        System.out.println("\nРешение:");
        for (
                int i : revertNumberTask9) {
            System.out.println(i + " ");
        }
    }

    static public void Task10() {
// 10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить нули в конец массива. Вывести результат в консоль
        System.out.println("\n *** \n\nЗадание 10.\nДанная программа обрабатывает массив чисел 15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52 и перемещает нули в конец массива");
        int[] numberTask10 = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] resultNumberTask10 = new int[numberTask10.length];
        int position = 0;
        for (
                int i : numberTask10) {
            if (i != 0) {
                resultNumberTask10[position] = i;
                position++;
            }
        }
        System.out.println("\nРешение:");
        for (
                int i : resultNumberTask10) {
            System.out.print(i + " ");
        }
    }
}