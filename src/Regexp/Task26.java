package Regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Задание 26
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */

public class Task26 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(",+.+:+;+?+!+-");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
