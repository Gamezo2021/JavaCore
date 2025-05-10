package Operators;

/**
 * Задание 12
 * Сгенерировать три произвольных целых числа X, Y и Z.
 * Если X больше Z, то вывести на экран сумму X и Y, иначе вывести на экран значение Z.
 * Вывести на экран среднее арифметическое этих чисел.
 * Логика в методе. System.out.println() в main
 */

public class OperatorsFinalTask {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = 3;
        System.out.print(mathCheck(x, y, z));
    }

    public static String mathCheck(int x, int y, int z) {
        String s = " ";
        float arithmeticMean = (x + y + z) / 3f;
        if (x > z) {
            s = "Сумма X + y = " + (x + y);
        } else
            s = "z = " + z;
        return s + " Среднее арифметическое = " + arithmeticMean;
    }
}
