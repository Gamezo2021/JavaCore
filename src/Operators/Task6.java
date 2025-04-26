package Operators;

/**
 * Задание 6
 * Создайте метод с одним целочисленным параметром. Метод должен определить,
 * является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.print(NumberСheck(-7));
    }

    public static boolean NumberСheck(int number) {
        return Math.abs(number) % 10 == 7;
    }
}

