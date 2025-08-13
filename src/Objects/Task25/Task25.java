package Objects.Task25;

import java.util.Scanner;

/**
 * Задание 25
 * Создать класс, описывающий Банкомат.
 * Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
 * Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
 * На экран – булевское значение (операция удалась или нет).
 * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
 */

public class Task25 {
    public static void main(String[] args) {
        ATM atm = new ATM(3, 1, 5);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите действие: \n1 - Проверить баланс \n2 - Пополнить баланс \n3 - Снять деньги с баланса \n4 - Выйти");
            choice = scanner.nextInt();
            if (choice == 1) {
                atm.printBalance();
            } else if (choice == 2) {
                System.out.println("Вы выбрали пополнение баланса");
                System.out.println("Введите колличество купюр номиналом 20");
                int number20 = scanner.nextInt();
                System.out.println("Введите колличество купюр номиналом 50");
                int number50 = scanner.nextInt();
                System.out.println("Введите колличество купюр номиналом 100");
                int number100 = scanner.nextInt();
                if (number20 < 0 || number50 < 0 || number100 < 0) {
                    System.out.println("Количество купюр не может быть отрацитальным");
                    return;
                }
                atm.AddBanknote(number20, number50, number100);
                System.out.println("Количество купюр после пополнения ");
                atm.printBalance();
            } else if (choice == 3) {
                System.out.println("Вы выбрали снятие денег");
                System.out.println("Введите сумму денег для снятия");
                int outSum = scanner.nextInt();
                if (outSum < 0) {
                    System.out.println("Нельзя снять отрицательную сумму денег");
                    return;
                }
                if (atm.withdrawMoney(outSum) == true) {
                    System.out.println("Сумма и количество купюр после снятия ");
                    atm.printBalance();
                }
            } else if (choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("Некорректный выбор ");
            }

        } while (choice != 4);
        System.out.println("Работа завершена , всего доброго");
    }
        }


