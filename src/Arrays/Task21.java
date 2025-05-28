package Arrays;

import java.util.Arrays;

import static Arrays.Task18.FillingTheArray;
import static Arrays.Task20.MaxElement;
import static Arrays.Task20.indexOfSearchElement;

/**
 * Задание 21
 * Создайте переменную для массива из n элементов. Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов
 * между максимальным и минимальным значениями.
 * Вывести исходный массив, максимальный и минимальный элемент, индексы всех максимальных и минимальных элементов,
 * индексы максимально удалённых элементов, сумму элементов массива,
 * расположенных между минимальным и максимальным значениями.
 * Импортировать методы из прошлых заданий. Логика в методах. System.out.println() в main.
 */

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
//        array[0] = 4;
//        array[1] = 4;
//        array[2] = 2;
//        array[3] = 0;
//        array[4] = 1;
        // System.out.println(Arrays.toString(array));


        System.out.println("Изначальный массив " + Arrays.toString(FillingTheArray(array)));
        System.out.println("Максимальный элемент массива = " + MaxElement(array));
        System.out.println("Индекс максимального значения " + multiElementsCheck(array, MaxElement(array), indexOfSearchElement(array, MaxElement(array))));
        System.out.println("Минимальный элемент массива = " + minElement(array));
        System.out.println("Индекс минимального элемента = " + indexOfSearchElement(array, minElement(array)));
        System.out.println("Индексы максимальных элементов " + findAllIndexOfMaxElements(array, MaxElement(array)));
        System.out.println("Индексы минимальных элементов " + findAllIndexOfMaxElements(array, minElement(array)));
        System.out.println("Сумма всех элементов массива = " + sumElements(array));
        System.out.println("Сумма элементов между максимальным и минимальным значением = " + sumBetweenMaxAndMin(array, multiElementsCheck(array, MaxElement(array), indexOfSearchElement(array, MaxElement(array))), multiElementsCheck(array, minElement(array), indexOfSearchElement(array, minElement(array)))));
        System.out.println("Индексы максимально удаленных элементов = " + indexOfDistantElements(array));
    }

    protected static int minElement(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    protected static int multiElementsCheck(int[] array, int element, int index) {
        int index1 = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (element == array[i]) {
                count++;
            }
            if (count > 1 && element == array[i]) {
                index = index1;
            }
            index1++;
        }
        return index;
    }

    protected static String findAllIndexOfMaxElements(int[] array, int element) {
        StringBuilder allIndex = new StringBuilder();
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            if (element == array[i]) {
                allIndex.append(index).append(" ");

            }
            index++;
        }
        return allIndex.toString();
    }

    protected static int sumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    protected static int sumBetweenMaxAndMin(int[] array, int indexOfMax, int indexOfMin) {
        int sum = 0;

        if (indexOfMax > indexOfMin) {
            for (int i = indexOfMin; i <= indexOfMax; i++) {
                sum += array[i];
            }
        }
        if (indexOfMax < indexOfMin) {
            for (int i = indexOfMax; i <= indexOfMin; i++) {
                sum += array[i];
            }
        }

        return sum;
    }

    protected static String indexOfDistantElements(int[] array) {
        StringBuilder str = new StringBuilder();
        str.append(0).append(" ").append(array.length);
        return str.toString();
    }
}
