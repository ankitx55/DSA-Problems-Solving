import java.util.Arrays;

public class IntertionSort {
    public static void main(String[] args){
        int arr[] = {6,5,4,3,3,2,1, -111, 4444};
        insertion(arr);
        String str = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
        System.out.println(str);
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j>0; j--){
//                if current element is smaller than the previous then swap
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
//                if current element is not smaller, then break  and jump out of the loop
                else
                    break;
            }
        }
    }

}

