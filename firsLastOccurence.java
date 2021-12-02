public class firsLastOccurence {
    public static void main(String[] args)
    {
        //creating thr array and target elements
        int[] arr={0,7,7,7,7,8,9};
        int target=7;
        int start=0;
        int end=arr.length-1;
        //printing the first and last index number of the target in the given array
        int ans=firstOccurence(arr, target, start, end);
        int ans1=lastOccurence(arr, target, start, end);
//        System.out.println(Arrays.toString(ans));
        System.out.println(ans+","+ans1);
    }

    static int firstOccurence(int[] arr, int target,int start, int end)
    {
        //intializing the binary search for first occurence
        int mid1=0;
        while(end>=start)
        {
            mid1= start+(end-start)/2;

            if(target<=arr[mid1])
                end=mid1-1;
            else if(target>arr[mid1])
                start=mid1+1;
            else
                return -1;

        }
        return mid1;
    }

    static int lastOccurence(int[] arr, int target,int start, int end)
    {
        int mid=0;
        while(end>=start)
        {
            mid= start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
            {
                if(target==arr[mid])
                    start=mid+1;
                else
                    return -2;
            }
        }
        return mid;
    }
}
