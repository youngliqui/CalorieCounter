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
        System.out.println("""
                1. Ввести количество шагов за определённый день
                2. Напечатать статистику за определённый месяц
                3. Ввести данные за весь месяц
                4. Изменить цель по количеству шагов в день
                0. Выйти из приложения

                Выберите функцию:\s""");
    }

    private static void functionSelection(int userInput) {
        switch (userInput){
            case 1:
                StepTracker.savingNumberOfStepsPerDay();
                break;
            case 2:
                StepTracker.calculationAndOutputStatistics();
                break;
            case 3:
                StepTracker.addStepsPerMonth();
                break;
            case 4:
                StepTracker.changingGoalOfSteps();
            case 0:
                break;
            default:
                System.out.println("Неверный ввод!");
                break;
        }
    }
}