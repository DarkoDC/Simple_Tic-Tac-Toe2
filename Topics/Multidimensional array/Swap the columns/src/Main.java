import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iDim = scanner.nextInt();
        int jDim = scanner.nextInt();

        int[][] matrix = new int[iDim][jDim];

        for (int i = 0; i < iDim; i++) {
            for (int j = 0; j < jDim; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int changeIndex1 = scanner.nextInt();
        int changeIndex2 = scanner.nextInt();

        for (int i = 0; i < iDim; i++) {
            int tmp = matrix[i][changeIndex1];
            matrix[i][changeIndex1] = matrix[i][changeIndex2];
            matrix[i][changeIndex2] = tmp;
        }

        for (int i = 0; i < iDim; i++) {
            for (int j = 0; j < jDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}