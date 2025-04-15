package Types;

/** Задание 3

 Написать код, который выведет значения переменных на экран:

 byte b = 0x55;
 short s = 0x55ff;
 int i = 1000000;
 long l = 0xffffffffL;
 char c = 'a' ;
 float f = .25f;
 double d = .00001234;
 boolean bool = true;

 Использовать 1 метод и 1 System.out.println().
 */

public class Task3 {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        System.out.println("byte b = 0x55;\n" +
                " short s = 0x55ff;\n" +
                " int i = 1000000;\n" +
                " long l = 0xffffffffL;\n" +
                " char c = 'a' ;\n" +
                " float f = .25f;\n" +
                " double d = .00001234;\n" +
                " boolean bool = true;");
    }
}
