package Arrays;

import java.util.Arrays;

import static Arrays.Task18.FillingTheArray;

/**
 * Задание 20
 * Создайте переменную для массива из n элементов. Заполните его произвольными значениями целочисленного типа.
 * Найдите максимальный элемент и выведите его и его индекс. Так же вывести исходный массив.
 * Импортировать методы из прошлых заданий. Логика в методах. System.out.println() в main.
 */


public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Исходный массив " + Arrays.toString(FillingTheArray(array)));
        System.out.println("Максимальный элемент = " + MaxElement(array));
        System.out.println("Индекс максимального элемента = " + indexOfSearchElement(array, MaxElement(array)));
    }

    protected static int MaxElement(int[] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    protected static int indexOfSearchElement(int[] array, int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index++;
            if (array[i] == element) break;
        }
        return index;
    }
}
