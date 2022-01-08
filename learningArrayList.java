import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class learningArrayList
{
    public static void main(String[] args)
    {
//        to initiate an arraylist;

//        ArrayList<Integer> myArrayList = new ArrayList<>();

//        this is how you set the element on any index
//        first parameter is the index and
//        second one is the value at that index

//        myArrayList.set(0,1);



//        another way to instantiate arraylist

        ArrayList<Integer> myArrayList2 =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(myArrayList2);
//        int length = myArrayList2.size();
//        System.out.println(length);
        List<Integer> str = reverseArray(myArrayList2);
        System.out.println(str);

    }

    static List<Integer> reverseArray(List<Integer> myArrayList2)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.set(0,222);
        arr.

        return arr;
    }
}

