
public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,11,13,14,10,18};
        int ans = largest(arr);
        System.out.println(ans);

    }

    static int largest(int[] arr){
        int second=-1;
        int current=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>current){
                second=current;
                current=arr[i];
            }
        }
        return second;
    }

}
