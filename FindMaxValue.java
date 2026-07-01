import java.util.Scanner;

public class FindMaxValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Validate size
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

        // Step 3: Search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 4: Display results
        System.out.println("\n===== Array Summary =====");
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Maximum value : " + maxValue);
        System.out.println("Found at index: " + maxIndex);
        System.out.println("==========================");

        scanner.close();
    }
}