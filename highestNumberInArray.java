public class highestNumberInArray
{
//    to return max element in the array
    public static void main(String[] args) {
        int arr[] = {1,2,10,4,5,6,7};
        int ans = maxNum(arr);
        System.out.println(ans);
    }

    static int maxNum(int[] arr)
    {
        int max= 0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]>max)
                max=arr[i];
            i++;
        }

        return max;
    }
}
