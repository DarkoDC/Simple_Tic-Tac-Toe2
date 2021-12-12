package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String cells = scanner.nextLine();
        final int dimension = 3;
        char[][] matrix = new char[dimension][dimension];

        System.out.println("---------");
        for (int i = 0; i < dimension; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = cells.charAt(i * dimension + j);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        int winX = 0;
        int winO = 0;
        int allX = 0;
        int allO = 0;
        boolean existsEmpty = false;

        for (int i = 0; i < dimension; i++) {
            int xInRow = 0;
            int oInRow = 0;
            int xInColumn = 0;
            int oInColumn = 0;
            for (int j = 0; j < dimension; j++) {
                if (matrix[i][j] == 'X') {
                    ++xInRow;
                } else if (matrix[i][j] == 'O') {
                    ++oInRow;
                } else {
                    existsEmpty = true;
                }

                if (matrix[j][i] == 'X') {
                    ++xInColumn;
                } else if  (matrix[j][i] == 'O') {
                    ++oInColumn;
                }
            }
            allX += xInRow;
            allO += oInRow;
            if (xInRow == dimension) {
                ++winX;
            } else if (oInRow == dimension) {
                ++winO;
            }
            if (xInColumn == dimension) {
                ++winX;
            } else if (oInColumn == dimension) {
                ++winO;
            }
        }

        int xInMainDiagonal = 0;
        int oInMainDiagonal = 0;
        int xInSecondDiagonal = 0;
        int oInSecondDiagonal = 0;
        for (int i = 0; i < dimension; i++) {
            if (matrix[i][i] == 'X') {
                ++xInMainDiagonal;
            } else if (matrix[i][i] == 'O') {
                ++oInMainDiagonal;
            }
            int secondaDiagonalIndex = dimension - 1 - i;
            if (matrix[i][secondaDiagonalIndex] == 'X') {
                ++xInSecondDiagonal;
            } else if (matrix[i][secondaDiagonalIndex] == 'O') {
                ++oInSecondDiagonal;
            }
        }
        if (xInMainDiagonal == dimension) {
            ++winX;
        } else if (oInMainDiagonal == dimension) {
            ++winO;
        }
        if (xInSecondDiagonal == dimension) {
            ++winX;
        } else if (oInSecondDiagonal == dimension) {
            ++winO;
        }

        if (Math.abs(allX - allO) > 1 || (winX > 0 && winO > 0)) {
            System.out.println("Impossible");
        } else if (winX > 0) {
            System.out.println("X wins");
        } else if (winO > 0) {
            System.out.println("O wins");
        } else if (existsEmpty) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
}
