import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int n=nums.length/2;

        int[] ans =  suffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] suffle(int nums[], int n)
    {

        int[] arr = new int[2*n];
        int i = 0;
        int j=0;
        while (i<n) {
            arr[j]=nums[i];
            arr[j+1]=nums[n+i];
            j+=2;
            i++;
        }
        return arr;
    }

}

