
class ArrayOperations {

    public static void printCorners(int[][] twoDimArray) {
        int lastRow = twoDimArray.length - 1;
        int lastColumn = twoDimArray[0].length - 1;
        System.out.printf("%d %d\n", twoDimArray[0][0], twoDimArray[0][lastColumn]);
        System.out.printf("%d %d", twoDimArray[lastRow][0], twoDimArray[lastRow][lastColumn]);
    }
}