import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthData = new HashMap<>();

    public StepTracker(){
        for (int i = 0; i < 12; i++) {
            monthData.put(i, new MonthData());
        }
    }
}
