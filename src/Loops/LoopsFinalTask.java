package Loops;

/**
 * Loops Дополнительное задание
 * <p>
 * Задать интервал положительных целых чисел. Вывести через пробел все числа Фибоначчи, попадающие в заданный интервал.
 * Логика в методе. System.out.println() в main.
 */


public class LoopsFinalTask {
    public static void main(String[] args) {
        int start = 50;
        int end = 150;
        System.out.print(fibonacciNumber(start, end));
    }

    private static StringBuilder fibonacciNumber(int start, int end) {
        StringBuilder result = new StringBuilder();
        int a = 0;
        int b = 1;
        while (b <= end) {
            int next = a + b;
            a = b;
            b = next;
            if (next >= start && next <= end) {
                result.append(next).append(" ");
            }
        }
        return result;
    }
}
