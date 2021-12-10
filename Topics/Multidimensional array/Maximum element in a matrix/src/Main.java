import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int rowWithMaxNumber = 0;
        int columnWithMaxNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrix[rowWithMaxNumber][columnWithMaxNumber]) {
                    rowWithMaxNumber = i;
                    columnWithMaxNumber = j;
                }
            }
        }
        System.out.printf("%d %d", rowWithMaxNumber, columnWithMaxNumber);
    }
}