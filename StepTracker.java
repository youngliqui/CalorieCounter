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

    public static void SavingNumberOfStepsPerDay() {
        Scanner scanner = new Scanner(System.in);
        boolean isGoodInput = false;

        do {
            System.out.println("Введите номер месяца: ");

            int userInput = scanner.nextInt();
            if (userInput >= 0 && userInput <= 12) {
                monthToData.put(userInput, new MonthData(userInput));
                isGoodInput = true;
                System.out.println(monthToData.get(userInput));
            }
        } while (!isGoodInput);

    }
}
