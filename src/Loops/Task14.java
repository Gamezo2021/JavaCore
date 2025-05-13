package Loops;

/**
 * Задание 14
 * <p>
 * Посчитать сумму цифр любого, в том числе очень большого целого числа с помощью цикла do while.
 * Логика в методе. System.out.println() в main.
 */


public class Task14 {
    public static void main(String[] args) {
        long a = 99999900099999L;
        System.out.print(sumOfNumbers(a));
    }

    public static long sumOfNumbers(long a) {
        long sum = 0;
        long b = 0;
        do {

            b = (int) (a % 10);
            sum += b;
            a = a / 10;
        } while (a > 0);
        return sum;
    }
}
