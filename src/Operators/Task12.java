package Operators;

public class Task12 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.print(mathCheck(x, y, z));
    }

    public static String mathCheck(int x, int y, int z) {
        String s = " ";
        if (x > z) {
            s = "Сумма X + y = " + (x + y);
        } else
            s = "z = " + z;
        return s + " Среднее арифметическое = " + (x + y + z) / 3;
    }
}
