package Loops;

import java.text.DecimalFormat;

/**
 * Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 * Логика в методе. System.out.println() в main. Не использовать специальные классы для форматирования чисел.
 */

public class Task17 {
    public static void main(String[] args) {
        long number = 11230000000456L;
        DecimalFormat df = new DecimalFormat("###,###.##");
        Long i = Long.parseLong(numberFormatting(number));
        System.out.print(df.format(i));
    }

    public static String numberFormatting(long number) {
        StringBuilder temp = new StringBuilder();
        while (number != 0) {
            long b = number % 10;
            number = number / 10;
            temp.append(b);
        }
        return temp.reverse().toString();
    }
}
