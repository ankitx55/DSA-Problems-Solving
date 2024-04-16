import java.util.ArrayList;
import java.util.Arrays;

public class learningArrayList
{
    public static void main(String[] args)
    {
//        Arrays
        int[] array = new int[2];
        array[1]=22;
        System.out.println(Arrays.toString(array));


        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(555);
        arr1.add(11111);
//        arr1.set(2,55555);

        arr1.add(2,4444);
//        this will put the initial 2nd index to
//        iterate one place further away and put itself at 2nd place

        System.out.println(arr1);

        int sizeOfArr1 = arr1.size();
        Integer arr2[] = new Integer[arr1.size()];
        arr2 = arr1.toArray(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1.get(2));


    }
}

