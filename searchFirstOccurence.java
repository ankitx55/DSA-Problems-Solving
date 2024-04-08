public class searchFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int ans = firstElement(arr, target);
        System.out.println(ans);
    }
    static int firstElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
