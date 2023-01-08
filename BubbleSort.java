import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,88,-9,66,-5};
        int l=arr.length;
        BubbleSortAlgorithm(arr, l);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSortAlgorithm(int arr[], int l){
        for(int i=l-1; i>0; i--){
            for(int j=0; j<l-1; j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
