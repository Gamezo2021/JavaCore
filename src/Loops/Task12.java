package Loops;

/**
 * Задание 12
 * <p>
 * Вычислить факториал числа (до 20 включительно) с помощью циклов while и for в разных классах.
 * Логика в методе. System.out.println() в main. Вывести в бухгалтерском формате любым способом.
 */

public class Task12 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(a + "! = " +FactorialWithWhile.factorial(a));
        System.out.println(a + "! = " +FactorialWithFor.factorial(a));
    }

    class FactorialWithWhile {
        public static int factorial(int a) {
            int factorial = 1;
            int i = a;
            while (i != 0) {
                factorial = factorial * i;
                --i;
            }
            return factorial;
        }
    }
    class FactorialWithFor {
        public static int factorial(int a) {
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial = factorial * i;
            }return  factorial;
        }
    }
}
