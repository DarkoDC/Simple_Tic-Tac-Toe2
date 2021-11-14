import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int lastNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            numbers[i] = lastNumber;
            lastNumber = tmp;
        }
        numbers[0] = lastNumber;

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}