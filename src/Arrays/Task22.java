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
        int[]array = new int[10];
        System.out.println("Изначальный массив " + Arrays.toString(FillingTheArray(array)));
        System.out.println("Перевернутый массив " + Arrays.toString(ArrayConversely(array)));
    }
    protected static int[] ArrayConversely(int[] array){

        int count1 = 0;
        int count  = array.length;
        for (int i = 0; i<array.length; i++){

            for (int b = count-1;;){
                array[i] = array [b];
                break;

            }
            count--;


        }
    return array;}
}
