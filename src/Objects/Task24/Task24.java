package Objects.Task24;

/**
 * Создать класс описывающий промежуток времени.
 * Сам промежуток в классе должен заваться тремя свойтсвами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секундр в обьекте, сравнения двух обьектов ( метод должен работать аналогично compereTo в строках).
 * Создать два констуртора :
 * 1) получающий общее количество секунд.
 * 2) получающий часы, минуты и секунды по отдельности.
 * Сделать метод лоя вывода данных.
 */
public class Task24 {
    public static void main(String[] args) {
        PeriodOfTime periodOfTime = new PeriodOfTime(-109210);
        PeriodOfTime periodOfTime1 = new PeriodOfTime(-10, 20, 30);
        periodOfTime.printTime();
        System.out.println("Общее колличество секунд " + periodOfTime.timeInSeconds(periodOfTime.getSeconds(), periodOfTime.getMinutes(), periodOfTime.getHour()));
        periodOfTime1.printTime();
        System.out.println("Общее колличество секунд " + periodOfTime1.timeInSeconds(periodOfTime1.getSeconds(), periodOfTime1.getMinutes(), periodOfTime1.getHour()));

        System.out.println(periodOfTime.compareTo(periodOfTime1));


    }





}

