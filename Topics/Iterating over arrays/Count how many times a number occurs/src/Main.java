import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersSize = scanner.nextInt();
        int[] numbers = new int[numbersSize];

        for (int i = 0; i < numbersSize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int searchingNumber = scanner.nextInt();
        int counter = 0;
        for (int number : numbers) {
            if (number == searchingNumber) {
                ++counter;
            }
        }
        System.out.println(counter);
    }
}