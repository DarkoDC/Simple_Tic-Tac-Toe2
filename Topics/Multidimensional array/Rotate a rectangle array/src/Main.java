import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsSize = scanner.nextInt();
        int columnsSize = scanner.nextInt();
        int[][] matrix = new int[rowsSize][columnsSize];

        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedMatrix = new int[columnsSize][rowsSize];
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                rotatedMatrix[j][rowsSize - 1 - i] = matrix[i][j];
            }
        }

        for (int[] rotatedRow : rotatedMatrix) {
            for (int number : rotatedRow) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}