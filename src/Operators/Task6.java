package Operators;

/** Задание 6
 Создайте метод с одним целочисленным параметром. Метод должен определить,
 является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        boolean result = NumberСheck();
        System.out.printf(String.valueOf(result));
    }
    public static boolean NumberСheck(){
        int number = 100557;
        if (number == 7){
            return true;
        }else if (number % 10 == 7){
            return true;
        }return false;
    }
}

