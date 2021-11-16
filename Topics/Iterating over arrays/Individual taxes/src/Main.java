import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companiesSize = scanner.nextInt();

        int[] incomes = new int[companiesSize];
        for (int i = 0; i < companiesSize; i++) {
            incomes[i] = scanner.nextInt();
        }

        int[] taxesInPercent = new int[companiesSize];
        for (int i = 0; i < companiesSize; i++) {
            taxesInPercent[i] = scanner.nextInt();
        }

        double largestTax = 0.0;
        int companyIndexWithLargestTax = 0;
        for (int i = 0; i < companiesSize; i++) {
            double tax = incomes[i] * taxesInPercent[i] / 100.0;
            if (tax > largestTax) {
                largestTax = tax;
                companyIndexWithLargestTax = i;
            }
        }
        System.out.println(companyIndexWithLargestTax + 1);
    }
}