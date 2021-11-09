import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersSize = scanner.nextInt();
        int max = 0;
        final int four = 4;
        int i = 0;
        while (i < numbersSize) {
            int number = scanner.nextInt();
            if (number > max && number % four == 0) {
                max = number;
            }
            i++;
        }
        System.out.println(max);
    }
}