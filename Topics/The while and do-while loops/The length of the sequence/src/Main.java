import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number;
        do {
            counter++;
            number = scanner.nextInt();
        } while (number != 0);
        System.out.println(--counter);
    }
}
