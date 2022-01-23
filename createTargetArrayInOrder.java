import java.util.ArrayList;

public class createTargetArrayInOrder
{
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr= new int[nums.length];
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int i =0;
        for(i = 0; i<nums.length; i++)
        {
            arrList.add(index[i], nums[i]);
        }

        for(i=0; i<nums.length; i++)
        {
            arr[i] = arrList.get(i);
        }

        return arr;

    }

}



