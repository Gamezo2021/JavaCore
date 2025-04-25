package Loops;

/**
 * Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 * Логика в методе. System.out.println() в main. Не использовать специальные классы для форматирования чисел.
 */

public class Task17 {
    public static void main(String[] args) {
        System.out.print(numberFormatting());
    }

    public static String numberFormatting() {
        int a = 12578645;
        String s = " ";
        String temp = "";
        String temp1 = "";
        String temp2 = "";
        while (a != 0) {

            int b = a % 1000;
            a = a / 1000;
            if (temp == "") {
                temp += s + b;
            } else if (temp1 == "") {
                temp1 += s + b;
            } else if (temp2 == "") {
                temp2 += s + b;
            }

        }
        return temp2 + temp1 + temp;


    }
}
