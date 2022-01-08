import java.util.ArrayList;
import java.util.Arrays;

public class minMaxSum
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(5,5,5,5,5));
        int size = arr.size();
        int sum=0;
        int i=0;

        for(i=0; i<5; i++)
        {
            sum=sum+arr.get(i);
        }
        System.out.println(sum);
        int tempSum = sum;
        long maxSum = 0;
        long minSum = sum-1;

        for(i=0; i<size; i++)
        {
            sum=sum-arr.get(i);

            if(maxSum<=sum)
                maxSum=sum;

            else if(minSum>=sum)
                minSum=sum;

            sum = tempSum;
        }

        System.out.println(minSum +" "+maxSum);
    }
}
