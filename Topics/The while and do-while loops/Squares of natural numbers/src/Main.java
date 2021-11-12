import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int number = 1;
        int square = 1;
        while (square <= max) {
            System.out.println(square);
            number++;
            square = number * number;
        }
    }
}
