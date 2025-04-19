package Types;

/** Задание 4

 Написать метод, который принимает на вход два целых числа,
 делает их суммирование и складывает результат с произведением двух этих чисел,
 и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
 Вывести полученный результат работы метода на экран.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.print(mathOperation(2,10));
    }
    public static int mathOperation(int a, int b) {
        return (a + b) + (a * b);
    }
}
