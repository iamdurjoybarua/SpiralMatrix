public class SpiralMatrix {

    public static void main(String[] args) {
        // Sample 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Print the matrix in spiral order
        printSpiral(matrix);
    }

    // Method to print a 2D array in spiral order
    public static void printSpiral(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return; // Return if the matrix is null or empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int direction = 0; // 0: right, 1: down, 2: left, 3: up

        // Loop until all elements are traversed
        while (top <= bottom && left <= right) {
            if (direction == 0) { // Traverse right
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++; // Move the top boundary down
                direction = 1; // Change direction to down
            } else if (direction == 1) { // Traverse down
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--; // Move the right boundary left
                direction = 2; // Change direction to left
            } else if (direction == 2) { // Traverse left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
                direction = 3; // Change direction to up
            } else if (direction == 3) { // Traverse up
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right
                direction = 0; // Change direction to right
            }
        }
        System.out.println(); // Print a newline after printing the spiral order
    }
}