import java.util.Arrays;
import java.util.Scanner;

public class MonthData {
    private String nameOfMonth;
    private static int[] completedSteps = new int[30];

    MonthData() {

    }

    MonthData(int numberOfMonth){
        Scanner scanner = new Scanner(System.in);
        nameOfMonth = String.valueOf(Months.values()[numberOfMonth]);

        short numberOfDay;
        do {
            System.out.println("Введите номер дня");
            numberOfDay = (short) (scanner.nextShort() - 1);
        } while(!(numberOfDay <= 29 && numberOfDay >= 0));

        do {
            System.out.println("Введите количество пройденных шагов");
            completedSteps[numberOfDay] = scanner.nextInt();
            if (completedSteps[numberOfDay] < 0) {
                System.out.println("Неверный ввод");
            }
        } while (completedSteps[numberOfDay] < 0);

    }

    public static void addCompletedStepsArray(int[] completedSteps2) {
        completedSteps = completedSteps2.clone();
    }

    public int getCompletedSteps(int index) {
        return completedSteps[index];
    }

    public String toString(){
        return nameOfMonth + "\n" + Arrays.toString(completedSteps);
    }
}
