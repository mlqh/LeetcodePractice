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
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0;
            while(j < k) {
                sum = nums[i] + nums[k] + nums[j];               
                if(sum == 0) {
                    solution.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            while(i < nums.length - 2 && nums[i + 1] == nums[i]) i++;
        } 
        return solution;
    }
}

