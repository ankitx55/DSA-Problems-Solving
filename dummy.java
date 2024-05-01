import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] input = new int[s.length()]; // Initialize with maximum possible length

        int count = 0; // Keep track of the actual number of elements in the array

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '.') {
                input[count++] = 0;
            } else if (currentChar == '-' && i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                if (nextChar == '.') {
                    input[count++] = 1;
                    i++; // Skip the next character
                } else if (nextChar == '-') {
                    input[count++] = 2;
                    i++; // Skip the next character
                }
            }
        }

        // Create a new array with the actual number of elements
        int[] actualInput = new int[count];
        System.arraycopy(input, 0, actualInput, 0, count);

        // Print the resulting array
        for (int num : actualInput) {
            System.out.print(num);
        }
    }
}
