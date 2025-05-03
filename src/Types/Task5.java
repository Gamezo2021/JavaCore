package Types;

/**
 * Задание 5
 * Задать промежуток времени в секундах в виде переменной.
 * Следует вывести его на экран в виде секунд, минут, часов, суток и недель.
 * Использовать остаток от деления. В меньшем интервале времени должно остаться только то,
 * что не вошло в больший. Использовать метод. System.out.println() в main.
 */

public class Task5 {
    public static void main(String[] args) {
        long timeInSeconds = 51818151110l;
        System.out.printf(TimeInsSeconds(timeInSeconds));
    }

    public static String TimeInsSeconds(long timeInSeconds) {
        int SecondsInWeek = 60 * 60 * 24 * 7;
        int SecondsInDay =  60 * 60 * 24 ;
        int SecondsInHour = 60 * 60;
        int timeInWeek = (int) (timeInSeconds /SecondsInWeek);
        int timeAfterWeek = (int) (timeInSeconds % SecondsInWeek);
        int timeInDay = timeAfterWeek / SecondsInDay;
        int timeAfterDay = timeAfterWeek % SecondsInDay;
        int timeInHour = timeAfterDay / SecondsInHour;
        int timeAfterHour = timeAfterDay % SecondsInHour;
        int timeInMinutes = timeAfterHour / 60;
        int TimeInSeconds = timeAfterDay % 60;
        String TimeInSecondsString = "Weeks: " + timeInWeek + " Days:" + timeInDay + " Hours:" + timeInHour + " Minutes:" + timeInMinutes + " Seconds:" + TimeInSeconds;
        return TimeInSecondsString;
    }

}
