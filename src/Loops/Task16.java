package Loops;

/**
 * Задание 16
 * Для целых чисел, которые делятся на 7 в заданном диапазоне, вывести на экран строку “Hope!”.
 * Логика в методе. System.out.println() в main..
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.print(divisionBySeven());
    }

    public static String divisionBySeven() {
        StringBuilder result = new StringBuilder();
        String s = " Hope! ";

        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                result.append(i).append(s);
            }
        }
        return result.toString();

    }
}
