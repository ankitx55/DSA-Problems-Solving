import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
//        49. Group Anagrams
//        https://leetcode.com/problems/group-anagrams/description/


        int[] nums = {1,2,3,4,5,0,0};
        int[] answer = productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));

    }


    static int[] productExceptSelf(int[] nums) {
        // answer array
        int[] answer = new int[nums.length];

        // product of all the elements of array
        int result = 1;
        for(int i = 0; i<nums.length; i++){
            result *=nums[i];
        }


        // product of all elements except itself
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                answer[i]=partialProduct(nums);
            } else{
                answer[i] = (result)/nums[i];
            }
        }

        return answer;
    }


    static int partialProduct(int[] nums){
        int result = 1;
        int zeroes = 0;
        for(int i = 0; i<nums.length; i++){
            // for first appearance of a zero
            if((nums[i]==0) && (zeroes<1)){
                zeroes++;
                continue;
            }

            // more more than 1 appearance of a zero
            if(zeroes>1){
                result=0;
            }
            result *=nums[i];

        }
        return result;
    }
}
