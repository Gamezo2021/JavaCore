package Operators;
/**
 * Задание 9
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 * Не использовать классы для работы с датами, только операторы. Использовать несколько методов.
 * Сделать двумя способами, например с if и switch в разных классах. Импортировать методы из другого класса.
 */

public class Task9 {
    public static void main(String[] args) {
        int day = 5;
        int month = 11;
        int year = 2020;
        DateConvert(day, month, year);
    }

    public static void DateConvert(int day, int month, int year) {
        if (day == 31 & month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            day = 1;
            if (month!=12){
            month++;}
            if ( day == 31 || month == 12) {
                ++year;
                month =1;
            }
        }
        else if (day == 30 & month == 4 || month == 6 || month == 9 || month == 11) {
            day = 1;
            ++month;
        } else if (day == 28 && month == 2) {
            day = 1;
            ++month;
        }
        System.out.printf("Day: " + day + "\nMonth: " + month + "\nYear: " + year + "\n");
    }
}


