import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    private int targetNumberOfSteps = 10000;
    private static HashMap<Integer, MonthData> monthToData = new HashMap<>();

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
        for (MonthData i : monthToData.values() )
        {
            System.out.println(i);
        }
    }
}
