

public class waterProblem
{
    public static void main(String[] args)
    {
//        https://leetcode.com/problems/container-with-most-water

        int [] height = {1,2,3};

//         area of rectangle is length*breadth
//         breadth will be height[i]
//         length will be the index diffrence
        int n = height.length;
//        int factorial = 1;
//        for(int i = 1; i <= n; i++)
//        {
//             factorial = factorial * i;
//        }
//        System.out.println("factorial val = "+factorial);
//        int n2 = factorial;
//         creating an array to store all such possible rectangle
        int[][] area = new int[n][n];

//         for finding the min of two index
        int minVal = 0;

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {

                if(height[i]<height[j])
                    area[i][j]=height[i]*(j-i);
                else
                    area[i][j] = height[j]*(j-i);
//                minVal = Math.min(height[i], height[j]);
//                area[i] = minVal * j;
//                System.out.println("area element val is"+area[i][j]);
            }
        }


        // now just find the max value element in area[][]

        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (area[i][j] > maxElement) {
                    maxElement = area[i][j];
                }
            }
        }
        System.out.println(maxElement);
    }



}
