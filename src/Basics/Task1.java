package Basics;

/** Задание 1
 Вывести Hello World. Использовать метод.
 */



public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.print("Hello World");
    }
    public void print(String string) {
        System.out.print(string);
    }
}