package Arrays;

import java.util.Arrays;

/**
 * Задание 23
 * Создать двухмерный квадратный массив n x n и заполнить его «бабочкой» буквами, например X и O, то есть таким образом:
 * X X X X X X X X X X
 * O X X X X X X X X O
 * O O X X X X X X O O
 * O O O X X X X O O O
 * O O O O X X O O O O
 * O O O O X X O O O O
 * O O O X X X X O O O
 * O O X X X X X X O O
 * O X X X X X X X X O
 * X X X X X X X X X X
 * Вывести на экран. Логика в методах.
 */

public class Task23 {
    public static void main(String[] args) {
        char[][] array = new char[10][10];
        createArrayButterflyStyle(array);
        printArray(array);
    }

    protected static char[][] createArrayButterflyStyle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array.length; b++) {
                if (i < array.length / 2) {
                    if (b >= i && b < array.length - i) {
                        array[i][b] = 'X';
                    } else {
                        array[i][b] = 'O';
                    }
                } else {
                    if (b >= array.length - 1 - i && b < array.length - (array.length - 1 - i)) {
                        array[i][b] = 'X';
                    } else {
                        array[i][b] = 'O';
                    }
                }
            }
        }
        return array;
    }

    protected static void printArray(char[][]array){
        for (int i = 0; i<array.length;i++){
            for (int b = 0; b <array[i].length;b++){
                System.out.print(array[i][b]);
            }
            System.out.println();
        }
    }
}
