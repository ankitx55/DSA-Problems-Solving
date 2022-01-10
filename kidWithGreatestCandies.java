import java.util.ArrayList;

public class kidWithGreatestCandies
{

//    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

    public static void main(String[] args)
    {
        int candies[] = {1, 2, 3, 4, 5, 6};
        int extraCandies = 3;
//        String ans = kidWithCandies(candies, extraCandies);
//        Ans ans = new Ans();
//        kidWithGreatestCandies.kidsWithCandies;

        newArr.kidsWithCandies(candies, extraCandies);


    }

}

class newArr{
    static void kidsWithCandies(int[] candies, int extraCandies) {

//         To find max number in the array
        int max= 0;
        int i=0;
        while(i<candies.length)
        {
            if(candies[i]>max)
                max=candies[i];
            i++;
        }

        ArrayList<Boolean> myArr = new ArrayList<>();

//         initiate loop to fill true and false
        for(i=0; i<candies.length; i++)
        {
            if(candies[i]+extraCandies>=max)
                myArr.add(true);

            else
                myArr.add(false);
        }

        System.out.println(myArr);

    }

}
