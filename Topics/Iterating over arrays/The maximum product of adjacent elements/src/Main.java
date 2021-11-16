import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 1; i < numbers.length; i++) {
            int adjacent = numbers[i] * numbers[i - 1];
            if (adjacent > max) {
                max = adjacent;
            }
        }
        System.out.println(max);
    }
}