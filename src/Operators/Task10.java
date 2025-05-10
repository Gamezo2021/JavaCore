package Operators;

/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 * Проверить,помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 * Логика в методе. System.out.println() в main.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;

        int c = 1;
        int d = 7;

        int e = 100;
        int f = 10;
        System.out.print(CapacityСheck(a, b, c, d, e, f));
    }

    public static String CapacityСheck(int a, int b, int c, int d, int e, int f) {
        int siteSquare = e * f;
        int FirstHouseSquare = a * b;
        int SecondHouseSquare = c * d;
        if ((siteSquare >= FirstHouseSquare + SecondHouseSquare && e >= a + c && f >= b + d && e >= (a | c) && f >= (b | d)) || (e >= a && e >= c && f >= b + d) || (e >= a + c && f >= b && f >= d)) {
            return "Yes";
        }
        return "No";
    }
}
