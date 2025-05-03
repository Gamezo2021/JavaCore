package Operators;

/**
 * Задание 6
 * Создайте метод с одним целочисленным параметром. Метод должен определить,
 * является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        int a = -3;
        System.out.print(NumberСheck(a));
    }

    public static boolean NumberСheck(int a) {
        return Math.abs(a) % 10 == 7;
    }
}

