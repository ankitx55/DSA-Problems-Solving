import java.util.Arrays;


public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,3,2,3,4,5,3,6,7,3,33,3,8,9,3,0};
//        int nums[] = {2};

        int count = 0;
        int val = 3;


        int ans = removeElement(nums, val);

        System.out.println(ans+", "+ Arrays.toString(nums));

    }

    static int removeElement(int[] nums, int val) {


//         swapping all the target elements to the last possible index
//         using the code of selection sort

        for(int length=nums.length-1; length>0; length--)
        {
            for(int i = 0; i<length; i++)
            {
//                 if arr[i] equals target it should be
//                 swapped to the last element through this.
                if(nums[i]==val)
                    swap(nums, i, length);
            }
        }

//         to count the array length
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != val)
                count++;
        }

        return count;

    }

    //     to swap the target element with last element
    static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

//     Okay Bye!!


}
