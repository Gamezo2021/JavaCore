package Types;

/** Задание 5
 Задать промежуток времени в секундах в виде переменной.
 Следует вывести его на экран в виде секунд, минут, часов, суток и недель.
 Использовать остаток от деления. В меньшем интервале времени должно остаться только то,
 что не вошло в больший. Использовать метод. System.out.println() в main.
 */

public class Task5 {

    public String TimeInsSeconds(long timeInSeconds) {
        int timeInWeek = (int) (timeInSeconds / 604800);
        int timeAfterWeek = (int) (timeInSeconds % 604800);
        int timeInDay = timeAfterWeek / 86400;
        int timeAfterDay = timeAfterWeek % 86400;
        int timeInHour = timeAfterDay / 3600;
        int timeAfterHour = timeAfterDay % 3600;
        int timeInMinutes = timeAfterHour / 60;
        int TimeInSeconds = timeAfterDay % 60;
        String TimeInSecondsString = "Weeks: " + timeInWeek + " Days:" + timeInDay + " Hours:" + timeInHour + " Minutes:" + timeInMinutes + " Seconds:" + TimeInSeconds;
        return TimeInSecondsString;
    }
    public static void main(String[] args) {
        long timeInSeconds = 51818151116l;
        Task5 task5 = new Task5();
        System.out.printf(task5.TimeInsSeconds(timeInSeconds));
    }
}
