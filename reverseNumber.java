public class reverseNumber {

//    https://leetcode.com/problems/reverse-integer/
    public static void main(String[] args) {
        int x= -2121;

        int ans = reverse(x);
        System.out.println("Original Number: "+x);
        System.out.println("Reversed Number: "+ans);

    }

    static int reverse(int x){
        final int INT_MAX = 2_147_483_647;
        final int INT_MIN = -2_147_483_648;

        int result = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x = Math.abs(x);
        }

        while (x != 0) {
            int digit = x % 10;

            if (result > (INT_MAX - digit) / 10) {
                return 0;
            }

            result = result * 10 + digit;
            x /= 10;
        }

        return result * sign;
    }
}
