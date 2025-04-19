package Operators;

/**
 * Задание 7
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (то же целое число).
 * Проверка в методе. System.out.println() в main.
 */

public class Task7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int r = 15;
        int d = r * 2;
        System.out.print(checkСlosing(a, b, d));


    }

    public static boolean checkСlosing(int a, int b, int d) {
        if (d >= (Math.sqrt(a * a + b * b))) {
            return true;
        }
        return false;
    }

}
