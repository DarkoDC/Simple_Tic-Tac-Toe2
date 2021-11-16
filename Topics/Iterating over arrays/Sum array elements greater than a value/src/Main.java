import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int number : numbers) {
            if (number > n) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}