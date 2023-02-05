import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    private static int targetNumberOfSteps = 10000;
    private static  HashMap<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker(){
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    public static void savingNumberOfStepsPerDay() {
        Scanner scanner = new Scanner(System.in);
        boolean isGoodInput = false;

        do {
            System.out.println("Введите номер месяца: ");

            int userInput = scanner.nextInt() - 1;
            if (userInput >= 0 && userInput <= 11) {
                monthToData.put(userInput, new MonthData(userInput));
                isGoodInput = true;
            }
        } while (!isGoodInput);

    }

    public static void calculationAndOutputStatistics() {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Введите номер месяца");
            userInput = scanner.nextInt() - 1;
        } while(!(userInput <= 29 && userInput >= 0));

        System.out.println(Months.values()[userInput].getTranslation() + ": ");

        int stepsMonth = 0;
        int maxSteps = 0;
        short bestSeriesOfSteps = 0;
        short seriesOfSteps = 0;

        for (int i = 0; i < 30; i++) {

            int steps = monthToData.get(userInput).getCompletedSteps(i);

            if (steps > targetNumberOfSteps)
                seriesOfSteps++;

            if (steps < targetNumberOfSteps)
                seriesOfSteps = 0;

            if (seriesOfSteps > bestSeriesOfSteps)
                bestSeriesOfSteps = seriesOfSteps;

            if (steps > maxSteps)
                maxSteps = steps;

            stepsMonth += steps;

            System.out.println(i + 1 + " день: " + steps);

            }

        System.out.println("Общее количество шагов за месяц: " + stepsMonth);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxSteps);
        System.out.println("Среднее количество шагов: " + stepsMonth / 30);
        System.out.println("Пройденная дистанция (в км): " + Converter.stepsInCentimeters(stepsMonth) / 100000);
        System.out.println("Количество сожженных килокалорий: " + Converter.stepsInCalories(stepsMonth));
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней,\n в течении которых количество шагов за день было выше целевого: " + bestSeriesOfSteps + " дней\n");

    }

    public static void changingGoalOfSteps() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите новую цель шагов: ");
            targetNumberOfSteps = scanner.nextInt();
            if (targetNumberOfSteps < 0)
                System.out.println("Ошибка ввода!");
        } while(targetNumberOfSteps < 0);
    }

    public static void addStepsPerMonth() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        do {
            System.out.println("Введите номер месяца");
            userInput = scanner.nextInt() - 1;
        } while (!(userInput <= 11 && userInput >= 0));

        int[] completedSteps = new int[30];
        System.out.println("Введите количество пройденных шагов");
        for (int i = 0; i < 30; i++) {
            do {
                System.out.println("День " + (i + 1));
                completedSteps[i] = scanner.nextInt();
            } while (completedSteps[i] < 0);
        }
        MonthData.addCompletedStepsArray(completedSteps);
    }
}
