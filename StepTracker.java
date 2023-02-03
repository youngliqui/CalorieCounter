import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    private int targetNumberOfSteps = 10000;
    private HashMap<Integer, MonthData> monthData = new HashMap<>();

    public StepTracker(){
        for (int i = 0; i < 12; i++) {
            monthData.put(i, new MonthData());
        }
    }

    public void SavingNumberOfStepsPerDay() {
        Scanner scanner = new Scanner(System.in);

    }
}
