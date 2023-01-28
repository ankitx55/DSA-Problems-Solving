import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[a]-1;
            if (arr[a] != arr[correctIndex]){
//                swap
                int temp =arr[a];
                arr[a]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                a++;
            }
        }
    }
}
