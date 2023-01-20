import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            int currElement = arr[j];
            if(currElement==arr[currElement-1]){
                
            }
            else{
                int temp = currElement;
                currElement=arr[currElement-1];
                arr[currElement-1]=temp;
            }
            }
        }
    }
