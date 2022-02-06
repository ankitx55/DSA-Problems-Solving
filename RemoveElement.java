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

        int count = 0;
        int length;
        for (length = nums.length-1; length > 0; length--) {
            for (int i = 0; i < length; i++) {
                if(nums[i]==val)
                    swap(nums, i, length);
                else if(nums[i]!=val)
                {count++;}
            }
        }
        // int k = nums.length-count;
        int k = count;
        return k;
    }

    static void swap(int nums[], int i, int j)
    {
        int temp=0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }


}
