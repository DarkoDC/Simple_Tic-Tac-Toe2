import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int barrier = 1000;
        int sum = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            if (sum >= barrier) {
                sum -= barrier;
                break;
            }
        }
        System.out.println(sum);
    }
}