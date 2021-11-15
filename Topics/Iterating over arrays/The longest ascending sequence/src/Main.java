import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maxAscendingNumbers = 1;
        int localCounter = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                ++localCounter;
            } else {
                localCounter = 1;
            }
            if (localCounter > maxAscendingNumbers) {
                maxAscendingNumbers = localCounter;
            }
        }
        System.out.println(maxAscendingNumbers);
    }
}