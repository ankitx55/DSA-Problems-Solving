import java.util.Arrays;

public class removingDuplicates {
    public static void main(String[] args) {

        int count=0;
        int array[] = {1,1,2,3,3,3,3,4,4,5,6,6,8,9,99,99,999,999};

        removingFunc(array, count);
        System.out.println(Arrays.toString(array)+" "+count);
        
    }
    static int removingFunc(int[] array, int count){
        for(int i=0; i<array.length; i++){
            if(i<array.length-1 && array[i]==array[i+1]){
                continue;
            }
            array[count]=array[i];
            count++;
        }
        return count;
    }
}
