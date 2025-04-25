package Loops;

/**
 * Задание 15
 * Найти среди чисел из заданного промежутка второе простое число
 * (число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
 * Логика в методах. System.out.println() в main. Не использовать классы для определения простого числа.
 */

public class Task15 {
    public static void main(String[] args) {
        System.out.print(primeNumber());
    }

    public static int primeNumber() {

        int i;
        for (i = 1; i <= 10; ++i) {
            if (i / i == 1 && i / 1 == i) {
                if (i == 2 || i == 1) {
                    continue;
                }
                break;
            }
        }
        return i;
    }
}
