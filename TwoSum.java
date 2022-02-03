import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args)
    {
//        Given an array of integers num and an integer target, return indices of the two numbers such that they add up to target
//        You may assume that each input would have exactly one solution, and you may not use the same element twice
//        You can return the answer in any order

        int[] nums ={2,7,11,15};
        int target = 9;
        int[] ans = TwoSums(nums, target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] TwoSums(int[] nums, int target)
    {

        int i=0, j=0;
        for ( i = 0; i < nums.length; i++)
        {
            for (j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        int[] arrrr = {i, j};
        return arrrr;

    }
}
