import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = scanner.nextInt();

        System.out.println("Factorial number:");
        int factorial = calculateFactorial(n);
        System.out.println("Factorial " +  n + " is " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }


    }

}


OUTPUT:

Enter the number of terms:7
Factorial number:
Factorial 7 is 5040
