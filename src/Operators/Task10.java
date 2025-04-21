package Operators;

/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 * Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 * Логика в методе. System.out.println() в main.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        int c = 10;
        int d = 30;
        int e = 50;
        int f = 60;
        System.out.print(CapacityСheck(a, b, c, d, e, f));
    }

    public static String CapacityСheck(int a, int b, int c, int d, int e, int f) {
        int sitePerimeter = e * f;
        int FirstHousePerimeter = a * b;
        int SecondHousePerimeter = c * d;
        if (sitePerimeter >= FirstHousePerimeter + SecondHousePerimeter && e >= a + c && f >= b + d && e >= (a | c) && f >= (b | d)) {
            return "Yes";
        }
        return "No";
    }
}
