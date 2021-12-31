public class medianOfTwoArray
{
    public static void main(String[] args)
    {
        int[] nums1 ={1,3};
        int[] nums2 ={2,7};
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);


    }



    static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a1 = nums1.length;
        // determining length of second array
        int b1 = nums2.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        double[] c = new double[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in
            // the resultant array
            c[i] = nums1[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the
            // resultant array
            c[a1 + i] = nums2[i];
        }

//         using insertion sort to sort the array in ascending order
        int j=0;
        for (int i = 1; i < c.length; i++)
        {
            double currentVal = c[i];

            for(j=i-1; j>=0 && c[j]>currentVal; j--)
            {
                c[j+1]=c[j];
                // System.out.print(i+", "+j);
                // System.out.println(" in second loop "+Arrays.toString(arr));
            }
            c[j+1]=currentVal;
            // System.out.print(i+", "+j);
            // System.out.println(" in first loop "+Arrays.toString(arr));
        }
        // System.out.println(" in final answer "+Arrays.toString(arr));


        double median = (c[0]+c[c1-1])/2;
        return median;


    }
}
