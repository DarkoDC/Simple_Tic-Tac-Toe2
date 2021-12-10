class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        final int thirdRowIndex = 2;
        for (int col = 0; col < twoDimArray[thirdRowIndex].length; col++) {
            System.out.print(twoDimArray[thirdRowIndex][col] + " ");
        }
    }
}