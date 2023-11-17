package Arrays;

/*
 * https://leetcode.com/problems/container-with-most-water/description/
 */

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int maxHeight = Math.min(height[left], height[right]);
            max = Math.max(max, maxHeight * (right - left));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}