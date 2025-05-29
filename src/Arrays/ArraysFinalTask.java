package Arrays;


import java.util.Arrays;
import java.util.Random;

import static Arrays.Task20.MaxElement;
import static Arrays.Task21.minElement;
import static Arrays.Task20.indexOfSearchElement;

/**
 * Arrays Финальное задание
 * Сгенерировать массив из n случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
 * Вывести исходный массив, максимальный и минимальный элемент и их индексы.
 * Заменить максимальный элемент на минимальный, умноженный на максимальный. Вывести полученный массив.
 * Импортировать методы из прошлых заданий. Логика в методах. System.out.println() в main.
 */

public class ArraysFinalTask {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Исходный массив " + Arrays.toString(FillingTheArray(array)));
        System.out.println("Максимальный элемент = " + MaxElement(array));
        System.out.println("Индекс максимального элемента = " + indexOfSearchElement(array, MaxElement(array)));
        System.out.println("Минимальный элемент = " + minElement(array));
        System.out.println("Индекс минимального элемента = " + indexOfSearchElement(array, minElement(array)));
        System.out.println("Массив с заменой макс. элемента на минимальный * макс. " + Arrays.toString(arrayWithReplacedMaxOnMin(array, MaxElement(array), minElement(array))));
    }

    protected static int[] FillingTheArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            int minValue = -300;
            int maxValue = 301;
            int randomNumber = minValue + random.nextInt(maxValue - minValue);
            myArray[i] = randomNumber;
        }
        return myArray;
    }

    protected static int[] arrayWithReplacedMaxOnMin(int[] array, int maxValue, int minValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                int newValue = minValue * maxValue;
                array[i] = newValue;
            }
        }
        return array;
    }
}
