public class containerWithMostWater {
    public static void main(String[] args) {
//        11. Container With Most Water
//        You are given an integer array height of length n. There are n vertical lines drawn such that the two
//        endpoints of the ith line are (i, 0) and (i, height[i]).
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//        Return the maximum amount of water a container can store.
//        Notice that you may not slant the container.

        int height[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    static int maxArea(int[] height){
        int area = 0;
        int first = 0;
        int last = height.length-1;
        while(first<last){
            area = Math.max(area, Math.min(height[first],height[last])*(last-first));
            if(height[first]<height[last]){
                first++;
            }
            else{
                last--;
            }
        }
        return area;
    }
}
