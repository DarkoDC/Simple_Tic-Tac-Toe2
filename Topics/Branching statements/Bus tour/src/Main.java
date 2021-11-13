import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 0; i < bridges; i++) {
            if (busHeight >= scanner.nextInt()) {
                crashed = true;
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}