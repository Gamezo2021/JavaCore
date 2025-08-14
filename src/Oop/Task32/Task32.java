package Oop.Task32;

/**
 * Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Task32 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(10,12,"LG","19g7", 300,true);
        fridge.printInfo();
        fridge.turnOff();
        TV tv = new TV(0,10,"LG","18D",1000);
        tv.printInfo();
        tv.turnOn();
    }
}
