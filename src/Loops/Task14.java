package Loops;

public class Task14 {
    public static void main(String[] args) {
        long a = 123456789;
        System.out.print( sumOfNumbers(a));
    }

    public static long sumOfNumbers(long a) {
        long sum = 0;
        int b = 0;
        do {
            sum += b;
           b= (int) (a%10);
           a = a/10;
        } while (a > 0);
        return sum;
    }
}
