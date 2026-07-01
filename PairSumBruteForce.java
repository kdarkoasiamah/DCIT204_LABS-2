import java.util.Scanner;

public class PairSumBruteForce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Please enter a positive number: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];

        // Step 2: Prompt user to enter each element
        System.out.println("\nEnter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Prompt for target sum
        System.out.print("\nEnter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute Force (Nested Loop) search for a matching pair
        boolean found = false;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break;
                }
            }
        }

        // Step 5 / 6: Display results
        System.out.println("\n===== Pair Sum Search Result =====");
        if (found) {
            int val1 = numbers[firstIndex];
            int val2 = numbers[secondIndex];
            System.out.println("Pair found!");
            System.out.println("Indices : [" + firstIndex + "] and [" + secondIndex + "]");
            System.out.println("Values  : " + val1 + " and " + val2);
            System.out.println("Equation: " + val1 + " + " + val2 + " = " + target);
        } else {
            System.out.println("No pair of numbers in the array sums to " + target + ".");
        }
        System.out.println("===================================");

        scanner.close();
    }
}
