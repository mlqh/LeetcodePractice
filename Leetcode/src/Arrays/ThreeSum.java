package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/3sum/description/
 * Sort, use two pointer left and right
 * Increment/decrement based on whether sum </> 0
 * Skip duplicates by check if prev/next element same
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(nums);
        for(int pivot = 0; pivot < nums.length - 2; pivot++) {
            int left = pivot + 1;
            int right = nums.length - 1;
            int sum = 0;
            while(left < right) {
                sum = nums[pivot] + nums[right] + nums[left];               
                if(sum == 0) {
                    solution.add(Arrays.asList(nums[pivot], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            while(pivot < nums.length - 2 && nums[pivot + 1] == nums[pivot]) pivot++;
        } 
        return solution;
    }
}

