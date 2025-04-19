package Operators;

/**
 * Задание 8
 * Задать целое число в виде переменной, это число – сумма(баланс) денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
 * Логика в методе. System.out.println() в main.
 */

public class Task8 {
    public static void main(String[] args) {
        int money = 0;
        System.out.print(moneyСonversion(money));

    }

    public static String moneyСonversion(int money) {
        String moneyString;
        if (money == 11 || money == 12 || money == 13 || money == 14 || money % 10 == 0 || money % 10 == 6 || money % 10 == 7 || money % 10 == 8 || money % 10 == 9) {
            moneyString = " Рублей";
        } else if (money % 10 == 1) {
            moneyString = " Рубль";
        } else {
            moneyString = " Рубля";
        }
        return money + moneyString;

    }
}
