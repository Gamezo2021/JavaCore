package Arrays;

import java.util.Arrays;

import static Arrays.Task18.FillingTheArray;

/**
 * Задание 22
 * Создайте переменную для массива из n элементов. Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран, переверните и снова выведите на экран (при переворачивании не создавать еще один массив).
 * Импортировать методы из прошлых заданий. Логика в методах. System.out.println() в main.
 */


public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[11];

        System.out.println("Изначальный массив " + Arrays.toString(FillingTheArray(array)));
        System.out.println("Перевернутый массив " + Arrays.toString(ArrayConversely(array)));
    }

    protected static int[] ArrayConversely(int[] array) {

        int count1 = 0;
        int count = array.length;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == b) break;
            if (i + 1 == b - 1) {
                count1 = array[i];
                array[i] = array[b - 1];
                array[b - 1] = count1;
                break;
            }
            count1 = array[i];
            for (b = count - 1; ; ) {
                array[i] = array[b];
                array[b] = count1;
                break;
            }
            count--;

        }
        return array;
    }
}
