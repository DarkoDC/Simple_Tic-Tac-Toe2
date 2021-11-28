import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = scanner.nextInt();
        char[][] matrix = new char[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = '.';
            }
        }

        int middleRow = dimension / 2;
        for (int i = 0; i < dimension; i++) {
            matrix[i][middleRow] = '*';
            matrix[middleRow][i] = '*';
            matrix[i][i] = '*';
            matrix[i][dimension - 1 - i] = '*';
        }

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}