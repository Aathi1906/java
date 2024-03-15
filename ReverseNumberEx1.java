import java.util.Scanner;

public class ReverseNumberEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reverse of the given number is: " + reverse);

        scanner.close(); // Close the scanner to release resources
    }
}


OUTPUT:


Enter a number to reverse: 768594
The reverse of the given number is: 495867

Process finished with exit code 0
