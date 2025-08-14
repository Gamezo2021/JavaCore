package Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 28
 * Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
 */
public class Task28 {
    public static void main(String[] args) {
        System.out.println("Введите текст для состояления текста из последих букв слов ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        int i = str.length();
        Pattern pattern = Pattern.compile("[\\wА-Яа-яЁё]\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str.append(matcher.group());
            ;
        }
        str.delete(0, i);
        System.out.println("Слово из последних букв - " + str);


    }
}
