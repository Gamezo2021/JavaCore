package Operators;

/**
 * Задание 11
 * <p>
 * Написать метод, который выводит расписание на неделю.
 * Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
 * Сделать двумя способами, например с if и switch в разных классах. System.out.println() в main.
 */

public class Task11 {
    public static void main(String[] args) {
        int nomberOfDayInWeek = 7;
        System.out.println(diaryWithIf.diaryWithIf(nomberOfDayInWeek));
        System.out.println(diaryWithSwitch.diaryWithSwitch(nomberOfDayInWeek));
    }

}

class diaryWithIf {
    public static String diaryWithIf(int nomberOfDayInWeek) {
        String planForTheDay = " ";
        if (nomberOfDayInWeek == 1) {
            planForTheDay = "Work on Sunday";
        } else if (nomberOfDayInWeek == 2) {
            planForTheDay = "Work on Monday";
        } else if (nomberOfDayInWeek == 3) {
            planForTheDay = "Work on Tuesday";
        } else if (nomberOfDayInWeek == 4) {
            planForTheDay = "Work on Wednesday";
        } else if (nomberOfDayInWeek == 5) {
            planForTheDay = "Work on Thursday";
        } else if (nomberOfDayInWeek == 6) {
            planForTheDay = "Work on Friday";
        } else if (nomberOfDayInWeek == 7) {
            planForTheDay = "Work on Saturday";
        } else planForTheDay = "There is no such day";
        return planForTheDay;
    }
}

class diaryWithSwitch {
    public static String diaryWithSwitch(int nomberOfDayInWeek) {
        String planForTheDay = " ";
        switch (nomberOfDayInWeek) {
            case 1:
                planForTheDay = "work on sunday";
                break;
            case 2:
                planForTheDay = "work on monday";
                break;
            case 3:
                planForTheDay = "work on tuesday";
                break;
            case 4:
                planForTheDay = "work on wednesday";
                break;
            case 5:
                planForTheDay = "work on thursday";
                break;
            case 6:
                planForTheDay = "work on friday";
                break;
            case 7:
                planForTheDay = "work on saturday";
                break;
            default:
                planForTheDay = "There is no such day";
        }
        return planForTheDay;
    }
}
