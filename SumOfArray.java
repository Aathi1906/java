import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize array with user-defined size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Display the sum of elements in the array
        System.out.println("Sum of all the elements of the array: " + sum);

        scanner.close(); // Close the scanner to release resources
    }
}


OUTPUT:


Enter the number of elements in the array: 5
Enter the elements of the array:
Element 1: 6
Element 2: 3
Element 3: 8
Element 4: 1
Element 5: 9
Sum of all the elements of the array: 27

Process finished with exit code 0



