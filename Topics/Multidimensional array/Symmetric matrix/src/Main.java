import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[][] matrix = new int[dimension][dimension];

        boolean isSymmetric = true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < dimension; i++) {
            for (int j = i + 1; j < dimension; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        String result = isSymmetric ? "YES" : "NO";
        System.out.println(result);
    }
}