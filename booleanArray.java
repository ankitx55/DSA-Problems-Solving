import java.util.Arrays;

public class booleanArray {

//    to return a boolean type array

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 4;

//        for all elements greater than target return boolean array
        boolean[] ans = booleanArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

//    creating the method needs to return boolean array
    static boolean[] booleanArray(int[] arr, int target)
    {
        int i=0;
        boolean[] boolArr = new boolean[arr.length];

        while(i<arr.length)
        {
            if(arr[i]>target)
                boolArr[i]=true;
            else
                boolArr[i]=false;
            i++;
        }

        return boolArr;
        let Arraylist<shuffleArray>=arr;
        
    }

}
