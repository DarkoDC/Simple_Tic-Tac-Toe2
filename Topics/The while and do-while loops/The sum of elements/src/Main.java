import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);
    }
}