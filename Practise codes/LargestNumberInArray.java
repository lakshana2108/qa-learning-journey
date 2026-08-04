public class LargestNumberInArray {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {12, 45, 7, 23, 89, 34};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Check each element and update largest if a bigger value is found
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the largest number
        System.out.println("Largest element is: " + largest);
    }
}
