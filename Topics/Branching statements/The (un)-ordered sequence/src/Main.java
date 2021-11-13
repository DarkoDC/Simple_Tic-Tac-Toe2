import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ascending = false;
        boolean descending = false;
        int lastNumber = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (lastNumber == 0) {
                lastNumber = number;
                continue;
            }
            if (number > lastNumber) {
                ascending = true;
            } else if (number < lastNumber) {
                descending = true;
            }
            if (ascending && descending) {
                break;
            }
            lastNumber = number;
        }
        System.out.println(!(ascending && descending));
    }
}