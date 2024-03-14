public class Swap {
    public static void main(String[] args) {
        int a = 5; // Declare and initialize variable a with value 5
        int b = 3; // Declare and initialize variable b with value 3

        System.out.println("Before swapping:");
        System.out.println("a = " + a); // Print the value of variable a
        System.out.println("b = " + b); // Print the value of variable b

        // Swapping without using a temporary variable
        a = a + b; // Add the values of a and b, store the result in a
        b = a - b; // Subtract the value of b from the new value of a, store the result in b
        a = a - b; // Subtract the new value of b from the new value of a, store the result in a

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a); // Print the value of variable a
        System.out.println("b = " + b); // Print the value of variable b
    }
}


OUTPUT:

Before swapping:
a = 5
b = 3

After swapping:
a = 3
b = 5

Process finished with exit code 0
