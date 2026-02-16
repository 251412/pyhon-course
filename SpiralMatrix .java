public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] myArr = new int[3][3];

        // Fill matrix with numbers 1 to 9
        int c = 1;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[0].length; j++) {
                myArr[i][j] = c++;
            }
        }

        // Print matrix in spiral order
        printSpiral(myArr);
    }

    static void printSpiral(int[][] a) {
        int startRow = 0, startCol = 0;
        int endRow = a.length - 1, endCol = a[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 1) Top row (left → right)
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(a[startRow][col] + " ");
            }

            // 2) Right column (top+1 → bottom)
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(a[row][endCol] + " ");
            }

            // 3) Bottom row (right-1 → left), only if more than one row
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    System.out.print(a[endRow][col] + " ");
                }
            }

            // 4) Left column (bottom-1 → top+1), only if more than one col
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    System.out.print(a[row][startCol] + " ");
                }
            }

            // Move inward
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
}
