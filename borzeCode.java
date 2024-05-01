import java.util.*;
public class borzeCode {
    public static void main(String[] args) {
//        https://codeforces.com/problemset/problem/32/B

//        Ternary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the ternary number given its representation in Borze alphabet.
//
//                Input
//        The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. It's guaranteed that the given string is a valid Borze code of some ternary number (this number can have leading zeroes).
//
//        Output
//        Output the decoded ternary number. It can have leading zeroes.


        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] input = new int[s.length()];


        for(int i = 0; i<s.length();i++ ){
            if(s.charAt(i)=='.'){
                input[i]=0;
            }
            else if(s.charAt(i)=='-'&&s.charAt(i+1)=='.'){
                input[i]=1;
                ++i;
            }
            else if(s.charAt(i)=='-'&&s.charAt(i+1)=='-'){
                input[i]=2;
                ++i;
            }



        }
        System.out.println(Arrays.toString(input));
//        int[] input = {1, 2, 3, 4, 5};
        StringJoiner joiner = new StringJoiner("");
        for (int num : input) {
            joiner.add(String.valueOf(num));
        }
        String arrayAsString = joiner.toString();
        System.out.println(arrayAsString); // Output: 12345






    }
}
