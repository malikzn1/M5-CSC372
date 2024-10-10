import java.util.Scanner;

public class ProductOfNumbers {

    // Recursive method to calculate product
    public static int calculateProduct(int[] numbers, int n) {
        // Base case: when there's only one number left, return it
        if (n == 0) {
            return numbers[0];
        }
        // Recursive case: multiply current number with the product of the rest
        return numbers[n] * calculateProduct(numbers, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Collect five numbers from the user
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Call the recursive method to calculate the product
        int product = calculateProduct(numbers, 4); // We pass 4 since arrays are 0-indexed

        // Output the product
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }
}
