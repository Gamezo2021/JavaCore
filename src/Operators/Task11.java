package Operators;

public class Task11 {
    public static void main(String[] args) {
        String day = "Sunday";
        System.out.println(diaryWithIf.diaryWithIf(day));
        System.out.println(diaryWithSwitch.diaryWithSwitch(day));
    }

}

class diaryWithIf {
    public static String diaryWithIf(String day) {
        if (day.equals("Sunday")) {
            day = "Work on Sunday";
        } else if (day.equals("Monday")) {
            day = "Work on Monday";
        } else if (day.equals("Tuesday")) {
            day = "Work on Tuesday";
        } else if (day.equals("Wednesday")) {
            day = "Work on Wednesday";
        } else if (day.equals("Thursday")) {
            day = "Work on Thursday";
        } else if (day.equals("Friday")) {
            day = "Work on Friday";
        } else if (day.equals("Saturday")) {
            day = "Work on Saturday";
        } else day = "There is no such day";
        return day;
    }
}

class diaryWithSwitch {
    public static String diaryWithSwitch(String day) {
        switch (day){
            case "Sunday":
                day = "work on sunday";
                break;
            case "Monday":
                day = "work on monday";
                break;
            case "Tuesday":
                day = "work on tuesday";
                break;
            case "Wednesday":
                day = "work on wednesday";
                break;
            case "Thursday":
                day = "work on thursday";
                break;
            case "Friday":
                day = "work on friday";
                break;
            case "Saturday":
                day = "work on saturday";
                break;
            default:
                day = "There is no such day";
        }
        return day;
    }
}
