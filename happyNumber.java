public class happyNumber {

//    https://leetcode.com/problems/happy-number/
    
    public static void main(String[] args) {
        int n =19;
        boolean ans = isHappy(n);
        System.out.println(ans);

    }


    static boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));

        while (slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }

        return slow == 1;
    }

    static int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

}
