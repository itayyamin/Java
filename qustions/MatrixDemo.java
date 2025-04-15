public class MatrixDemo {

    public static void main(String[] args) {
        // 1. Declare and initialize a 2D array (3 rows × 4 columns)
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // 2. Print the matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // 3. Access a specific element
        System.out.println("\nElement at row 1, col 2: " + matrix[1][2]); // Output: 7

        // 4. Modify an element
        matrix[2][3] = 99;
        System.out.println("\nMatrix after modifying element at row 2, col 3:");
        printMatrix(matrix);

        // 5. Get number of rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("\nMatrix has " + rows + " rows and " + cols + " columns.");
    }

    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
