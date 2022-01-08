import java.util.Arrays;

public class reverseArray
{
    public static void main(String[] args)
    {
        //Reversing whole array element

        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d= 0;

        int revArray[] = new int[n];

        for(int i=0; i<n; i++)
        {
            revArray[i]=arr[n-1-i];
//            int num = arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=num;
//            System.out.println(arr[i]+" ,"+arr[n-i-1]);

            revArray[i]=arr[n-1-i];

        }
        System.out.println("After reversing- "+ Arrays.toString(revArray));
    }
}
