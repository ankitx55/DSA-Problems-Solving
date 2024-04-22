import java.util.*;

public class longestSequence {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int ans = sequence(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }


    static int sequence(int[] nums){
        Arrays.sort(nums);
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
//        System.out.println(Arrays.toString(nums));
        int count=0;
        int max=1;
        int cur=1;

        for(int i = 0; i<nums.length-1; i++){

            if(nums[i+1]==nums[i]+1){
                count++;
                cur=count+1;
                max = Math.max(max, cur);
            }
            else if(nums[i]==nums[i+1])continue;
            else{
                count=0;
                cur=1;
            }
        }
        return max;
    }


}
