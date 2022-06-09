public class oddNumbersInTheInterval
{
    public int countOdds(int low, int high) {
        int count=0;
//         case 1 when both are odd
        if(low%2!=0 && high%2!=0)
        {
            count = (high-low)/2+1;
        }
//         case 2 when one of them is odd
        else if(low%2!=0 || high%2!=0)
        {
            count=(high-low)/2+1;
        }
//         case 3 when both are even
        else if(low%2==0 && low%2==0)
        {
            count=(high-low)/2;
        }
        return count;
    }
}
