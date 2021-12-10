import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] seats = new int[scanner.nextInt()][scanner.nextInt()];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        int freeSeatsToFind = scanner.nextInt();
        int rowWithEnoughFreeSeats = 0;
        for (int i = 0; i < seats.length && rowWithEnoughFreeSeats == 0; i++) {
            int freeSeats = 0;
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    freeSeats++;
                    if (freeSeats == freeSeatsToFind) {
                        rowWithEnoughFreeSeats = i + 1;
                        break;
                    }
                } else {
                    freeSeats = 0;
                }
            }
        }
        System.out.println(rowWithEnoughFreeSeats);
    }
}