package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String cells = scanner.nextLine();

        System.out.println("---------");
        for (int i = 0; i < cells.length(); i += 3) {
            System.out.printf("| %s %s %s |\n", cells.charAt(i), cells.charAt(i + 1), cells.charAt(i + 2));
        }
        System.out.println("---------");
    }
}
