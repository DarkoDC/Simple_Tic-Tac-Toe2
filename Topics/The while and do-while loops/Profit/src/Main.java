import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        int percent = scanner.nextInt();
        int goal = scanner.nextInt();
        int year = 0;
        final double hundred = 100.0;

        while (money < goal) {
            money += money * percent / hundred;
            year++;
        }
        System.out.println(year);
    }
}