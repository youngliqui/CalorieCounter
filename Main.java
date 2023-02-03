import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       printMenu();
       int userInput = scanner.nextInt();
        functionSelection(userInput);

       while (userInput != 0) {
           printMenu();
           userInput = scanner.nextInt();
           functionSelection(userInput);
       }
        System.out.println("Программа завершана!");
    }

    private static void printMenu() {
        System.out.println("1. Ввести количество шагов за определённый день\n" +
                           "2. Напечатать статистику за определённый месяц\n" +
                           "3. Изменить цель по количеству шагов в день\n" +
                           "0. Выйти из приложения\n\n" +
                           "Выберите функцию: ");
    }

    private static void functionSelection(int userInput) {
        switch (userInput){
            case 1:
                System.out.println("Вы выбрали 1");
                break;
            case 2:
                System.out.println("Вы выбрали 2");
                break;
            case 3:
                System.out.println("Вы выбрали 3");
                break;
            case 0:
                System.out.println("Вы выбрали 0");
                break;
            default:
                System.out.println("Вы выбрали " + userInput);
                System.out.println("Неверный ввод!");
                break;
        }
    }
}