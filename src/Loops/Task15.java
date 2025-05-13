package Loops;

/**
 * Задание 15
 * Найти среди чисел из заданного промежутка второе простое число
 * (число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
 * Логика в методах. System.out.println() в main. Не использовать классы для определения простого числа.
 */

public class Task15 {
    public static void main(String[] args) {
        int start = 5;
        int end = 60;
        System.out.print(isPrime(start, end));
    }

    public static int isPrime(int start, int end) {
        int i;
        int count = 0;
        for (i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sum++;
                }
            }
            if (sum == 0) {
                count++;
            }
            if (count == 2) {
                break;
            }
        }
        return i;
    }
}
