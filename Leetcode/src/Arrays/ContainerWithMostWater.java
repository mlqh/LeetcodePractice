package Arrays;

/*
 * https://leetcode.com/problems/container-with-most-water/description/
 */

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int leftIndx = 0, rightIndx = height.length - 1;
        int area = 0;
        while(leftIndx < rightIndx) {
            int larger = height[leftIndx] <  height[rightIndx] ?  height[leftIndx] :  height[rightIndx];
            area = area > larger * (rightIndx - leftIndx) ? area : larger * (rightIndx - leftIndx);
            if(height[leftIndx] < height[rightIndx]) {
                leftIndx++;
            } else {
                rightIndx--;
            }
        }
        return area;
    }
}