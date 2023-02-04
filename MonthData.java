import java.util.Scanner;

public class MonthData {
    private String nameOfMonth;
    private short numberOfDay;
    private int completedSteps;

    MonthData() {

    }

    MonthData(int numberOfMonth){
        Scanner scanner = new Scanner(System.in);
        nameOfMonth = String.valueOf(Months.values()[numberOfMonth]);

        do {
            System.out.println("Введите номер дня");
            numberOfDay = scanner.nextShort();
        } while(!(numberOfDay <= 30 && numberOfDay > 0));

        do {
            System.out.println("Введите количество пройденных шагов");
            completedSteps = scanner.nextInt();
            if (completedSteps < 0) {
                System.out.println("Неверный ввод");
            }
        } while (completedSteps < 0);

    }

    public String getMonthData(){
        return nameOfMonth + " " + numberOfDay + " " + completedSteps;
    }
}
