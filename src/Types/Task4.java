package Types;

/** Задание 4

 Написать метод, который принимает на вход два целых числа,
 делает их суммирование и складывает результат с произведением двух этих чисел,
 и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
 Вывести полученный результат работы метода на экран.
 */

public class Task4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(mathOperation(a,b));
    }
    public static int mathOperation(int a, int b) {
        return (a + b) + (a * b);
    }
}
