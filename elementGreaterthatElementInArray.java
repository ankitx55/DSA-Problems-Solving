public class elementGreaterthatElementInArray
{

        public int[] smallerNumbersThanCurrent(int[] nums) {
            int i = 0;
            int j = 0;
            int value = 0;

            int[] count = new int[nums.length];
            // ArrayList<Integer> count = new ArrayList<Integer>();

            for(i=0; i<nums.length; i++)
            {
                value = 0;
                for(j=0; j<nums.length; j++)
                {
                    if((i!=j) && (nums[i]>nums[j]))
                        value++;
                }
                count[i] = value;
            }

            // newCount = count.toArray(newCount);

            return count;

        }
    }