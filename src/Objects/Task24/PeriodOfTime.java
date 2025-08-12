package Objects.Task24;

public class PeriodOfTime implements Comparable<PeriodOfTime> {
    private int seconds;
    private int minutes;
    private int hour;

    public PeriodOfTime(int seconds, int minutes, int hour) {
        if (seconds < 0 || minutes < 0 || hour < 0) {
            System.out.println("Неверное время, время не может быть отрицательным");
            return;
        }
        this.seconds = seconds;
        this.minutes = minutes;
        this.hour = hour;
    }

    public PeriodOfTime(int seconds) {
        if (seconds < 0) {
            System.out.println("Неверное время, время не может быть отрицательным");
            return;
        }
        this.hour = seconds / 3600;
        this.minutes = seconds % 3600 / 60;
        this.seconds = seconds % 60;


    }

    public int timeInSeconds(int seconds, int minutes, int hour) {
        int result = (hour * 3600) + (minutes * 60) + seconds;
        return result;
    }

    public void printTime() {
        System.out.println("Секунд " + seconds + " минут " + minutes + " часов " + hour);
    }


    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int compareTo(PeriodOfTime o) {
        if (this.timeInSeconds(this.seconds, this.minutes, this.hour) > o.timeInSeconds(o.seconds, o.minutes, o.hour)) {
            return 1;
        } else if (this.timeInSeconds(this.seconds, this.minutes, this.hour) < o.timeInSeconds(o.seconds, o.minutes, o.hour)) {
            return -1;
        } else return 0;
    }
}
