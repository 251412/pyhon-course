public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] myArr = new int[3][3];

        // Fill matrix with numbers 1 to 9
        int c = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArr[i][j] = c++;
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }

        // Print spiral
        System.out.print("\nSpiral Order: ");
        int startRow = 0, startCol = 0;
        int endRow = 2, endCol = 2;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(myArr[startRow][col]);
            }
            // Right column
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(myArr[row][endCol]);
            }
            // Bottom row
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    System.out.print(myArr[endRow][col]);
                }
            }
            // Left column
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    System.out.print(myArr[row][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
