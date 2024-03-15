import java.util.Scanner;

public class Sub_Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows and columns in the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize arrays to store the matrices
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        // Prompt the user to enter the elements of matrix a
        System.out.println("Enter the elements of matrix a:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                a[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter the elements of matrix b
        System.out.println("Enter the elements of matrix b:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                b[i][j] = scanner.nextInt();
            }
        }

        // Perform subtraction and store the result in matrix diff
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        // Display the result
        System.out.println("Subtraction of two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); // Close the scanner to release resources
    }
}


OUTPUT:


Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of matrix a:
Enter element at position (0, 0): 12
Enter element at position (0, 1): 34
Enter element at position (1, 0): 56
Enter element at position (1, 1): 78
Enter the elements of matrix b:
Enter element at position (0, 0): 12
Enter element at position (0, 1): 23
Enter element at position (1, 0): 34
Enter element at position (1, 1): 56
Subtraction of two matrices:
0 11 
22 22 

Process finished with exit code 0


