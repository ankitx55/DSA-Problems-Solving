import java.util.Arrays;

public class countDuplicateNumbers {
    public static void main(String[] args) {
//        https://leetcode.com/problems/contains-duplicate/submissions/1234006255/
//        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        int[] nums = {1,2,3,4,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);

    }
    static boolean containsDuplicate(int[] nums) {
//        BRUTE FORCE, may not work for large arrays.
//        int i=0, j=0;
//        for ( i = 0; i < nums.length; i++)
//        {
//            for (j = i+1; j < nums.length; j++)
//            {
//                if (nums[i] == nums[j])
//                    return true;
//            }
//        }
//        return false;


//        Second approach
//        Sorting the array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
