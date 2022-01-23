import java.util.ArrayList;

public class FindHighestAltitude
//    https://leetcode.com/problems/find-the-highest-altitude/

{
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> altitude = new ArrayList<Integer>();
        int netAlt = 0;
        altitude.add(0,0);
        for(int i=0; i<gain.length; i++)
        {
            netAlt = netAlt+gain[i];
            altitude.add(i,netAlt);
        }

        int temp =(-100);

        for(int j =0; j<altitude.size(); j++)
        {
            if(temp<=altitude.get(j))
                temp = altitude.get(j);

        }
        return temp;
    }
}
