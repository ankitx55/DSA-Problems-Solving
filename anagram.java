import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
//        https://leetcode.com/problems/valid-anagram/description/
//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

        String s = "qwertyuiop";
        String t = "poiuytrewq";

        boolean ans = isAnagram(s, t);
        System.out.println(ans);

    }
    static boolean isAnagram(String s, String t){
        if(s.length()!=t.length())
            return false;


        // Using toCharArray() method of the String class over the
        // input string to create a character array for the input string.
        // char stringArray[] = inputString.toCharArray();
        char sTemp[] = s.toCharArray();
        char tTemp[] = t.toCharArray();

        // Sorting temp array using - Arrays.sort(tempArray)
        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        // compare char arrays - Arrays.equals(arr1, arr2)
        boolean ansBool = Arrays.equals(sTemp, tTemp);
        return ansBool;
    }
}
