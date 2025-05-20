package Arrays;

import java.util.Arrays;

/**
 * Задание 18
 * Создайте переменную для массива из n элементов.
 * Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
 * Так же вывести исходный массив. Логика в методах. System.out.println() в main.
 */

public class Task18 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.println("Исходный массив - " + Arrays.toString(FillingTheArray(myArray)));
        System.out.println("Последний элемент массива = " + lastElementOfArray(myArray));

    }

    private static int[] FillingTheArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }

        return myArray;
    }

    private static int lastElementOfArray(int[] myArray) {
        return myArray[myArray.length - 1];
    }
}
