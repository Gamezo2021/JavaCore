package Regexp;

import java.util.Scanner;


/**
 * Задание 27
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 * Учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) {
        System.out.println("Введите текст для поиска количества слов ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int length = str.split(" +").length;
        System.out.println("Количество слов в тексте = " + length);
        }
//
//Pattern pattern = Pattern.compile("\\b\\w+\\b");
//    Matcher matcher = pattern.matcher(str);
//        int count = 0;
//        while (matcher.find()){
//            count++;
//        }
//        System.out.println("Количество слов в тексте = " + count);
//    }
}
