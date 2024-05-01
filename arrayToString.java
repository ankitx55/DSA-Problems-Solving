import java.util.*;
public class arrayToString {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        StringJoiner joiner = new StringJoiner("");
        for (int num : input) {
            joiner.add(String.valueOf(num));
        }
        String arrayAsString = joiner.toString();
        System.out.println(arrayAsString); // Output: 12345

    }
}
