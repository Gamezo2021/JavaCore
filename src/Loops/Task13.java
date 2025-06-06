package Loops;

import java.math.BigInteger;
import java.text.DecimalFormat;

/**
 * Задание 13
 * Вычислить произведение чисел из заданного интервала (1 - 25 должно вычислять) с помощью цикла do while.
 * Логика в методе. System.out.println() в main. Вывести в бухгалтерском формате любым способом.
 */

public class Task13 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.print(" Произведение чисел от 1 до 25 = " + df.format(mathCheck()));
    }

    public static BigInteger mathCheck() {
        int i = 1;
        BigInteger sum = BigInteger.valueOf(1);
        do {
            sum = sum.multiply(BigInteger.valueOf(i));
            i++;

        }
        while (i <= 25);
        return sum;
    }
}
