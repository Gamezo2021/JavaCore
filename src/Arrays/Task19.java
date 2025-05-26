package Arrays;

import java.util.Arrays;

import static Arrays.Task18.FillingTheArray;



/**
 * Задание 19
 * Создайте переменную для массива из n элементов.
 * Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.
 * Так же вывести исходный массив. Импортировать метод из задания 18. Логика в методах. System.out.println() в main.
 */


public class Task19 {
    public static void main(String[] args) {
        int [] array = new int[12];
        System.out.println("Изначальный массив " + Arrays.toString(FillingTheArray(array)));

        System.out.println("Четные элементы массива " + Arrays.toString(evenArray(array)));
    }
    protected static int[] evenArray(int [] array){
        int count = 0;
        for (int i = 0; i < array.length;i++){
            if (i%2 != 0){
                count++;
            }
        }
        int [] evenArray = new int[count];
        int index = 0;
        for (int i = 0; i< array.length;i++){
            if (i%2 != 0){
                evenArray[index++] = array[i];
            }
        }
    return evenArray;}
}
