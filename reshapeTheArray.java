import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/reshape-the-matrix/

public class reshapeTheArray
{
    public static void main(String[] args)
    {
        int mat[][] = {{1,2,3,4}, {5,6,7,8}};
        int r=2;
        int c=4;
        int[][] ans = matrixReshape(mat, r,c);
        System.out.println(Arrays.deepToString(ans));

    }

        static int[][] matrixReshape(int[][] mat, int r, int c) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int[][] newArr = new int[r][c];
            int n=0;
            int row = mat.length;
            if(((mat[row-1].length)*(row))!=(r*c))
                return mat;

            for(int i= 0; i<mat.length; i++)
            {
                for(int j=0; j<mat[i].length; j++)
                {
                    arr.add(mat[i][j]);
                }
            }

            for(int k=0; k<r; k++)
            {
                for(int l=0; l<c; l++)
                {
                    newArr[k][l] = arr.get(n);
                    n++;
                }
            }

            return newArr;

        }
}
