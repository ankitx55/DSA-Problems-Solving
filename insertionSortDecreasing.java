import java.util.Arrays;

public class insertionSortDecreasing
{
    public static void main(String[] args)
    {
//        Insertion sort in decreasing order

        int[] arr = {5, 2, 4, 1, 3,6};
        int j = 0;

        for (int i = 1; i < arr.length; i++)
        {
            int currentVal = arr[i];

            for (j = i - 1; j >= 0 && arr[j] < currentVal; j--)
            {
                arr[j + 1] = arr[j];
                System.out.print(i + ", " + j);
                System.out.println(" in second loop " + Arrays.toString(arr));
            }
            arr[j + 1] = currentVal;
            System.out.print(i + ", " + j);
            System.out.println(" in first loop " + Arrays.toString(arr));
        }
        System.out.println(" in final answer " + Arrays.toString(arr));
    }
}
