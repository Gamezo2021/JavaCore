package Operators;

/**
 * Задание 9
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 * Не использовать классы для работы с датами, только операторы. Использовать несколько методов.
 * Сделать двумя способами, например с if и switch в разных классах. Импортировать методы из другого класса.
 */

public class Task9 {
    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 2021;
        new NextDayWithIf(day, month, year);
        new NextDayWithswitch(day, month, year);
    }
}

class NextDayWithIf {
    public NextDayWithIf(int day, int month, int year) {
        if (day == 31 && month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            day = 1;
            month++;
            if (month == 12) {
                ++year;
                month = 1;
            }
        } else if (day == 30 && month == 4 | month == 6 | month == 9 | month == 11) {
            day = 1;
            ++month;
        } else if (day == 28 && month == 2 && year % 4 == 0) {
            ++day;
        } else if (day == 28 && month == 2) {
            day = 1;
            ++month;
        } else ++day;
        System.out.printf("Day: " + day + "\nMonth: " + month + "\nYear: " + year + "\n");
    }
}

class NextDayWithswitch {
    public NextDayWithswitch(int day, int month, int year) {
        switch (day) {
            case 31:
                switch (month) {
                    case 1:
                        day = 1;
                        month++;
                        break;
                    case 3:
                        day = 1;
                        month++;
                        break;
                    case 5:
                        day = 1;
                        month++;
                        break;
                    case 7:
                        day = 1;
                        month++;
                        break;
                    case 8:
                        day = 1;
                        month++;
                        break;
                    case 10:
                        day = 1;
                        month++;
                        break;
                    case 12:
                        day = 1;
                        month = 1;
                        year++;
                        break;
                }
                break;
            case 30:
                switch (month) {
                    case 4:
                        day = 1;
                        month++;
                        break;
                    case 6:
                        day = 1;
                        month++;
                        break;
                    case 9:
                        day = 1;
                        month++;
                        break;
                    case 11:
                        day = 1;
                        month++;
                        break;
                }
            case 28:
                switch (year % 4) {
                    case 0:
                        day++;
                        break;
                }
                switch (day) {
                    case 28:
                        day = 1;
                        month++;
                        break;
                }
                break;
            default:
                ++day;
        }
        System.out.printf("Day: " + day + "\nMonth: " + month + "\nYear: " + year + "\n");
    }
}





