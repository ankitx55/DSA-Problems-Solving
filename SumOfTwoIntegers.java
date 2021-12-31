

public class SumOfTwoIntegers
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

//         Scanner in = new Scanner(System.in);
//         System.out.println("Please enter two numbers");
//         int a = in.nextInt();
//         int b = in.nextInt();
//         System.out.println("sum A+B is= ");
        int a= 2;
        int b=3;
        int ans = Solution( a, b);
        System.out.print(ans);
    }

    static int Solution(int a, int b){
        int sum= a+b;
        return sum;
    }
}
