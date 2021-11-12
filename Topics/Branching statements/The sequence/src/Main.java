import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int counter = 0;
        boolean maxReached = false;

        for (int i = 1; !maxReached && i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < i; j++) {
                counter++;
                if (counter > max) {
                    maxReached = true;
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}