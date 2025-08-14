package Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 29
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
 */


public class Task29 {
    public static void main(String[] args) {
        System.out.println("Введите текст для поиск в строке шестнадцатеричных чисел ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("0[xX][0-9A-Fa-f]{2}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
