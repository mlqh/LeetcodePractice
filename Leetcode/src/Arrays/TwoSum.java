package Arrays;
import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/description/
 * Use array value as key, index as value
 * Common Question
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                solution[0] = i;
                solution[1] = map.get(target - nums[i]);
                return solution;
            }
            map.put(nums[i], i);
        } 
        return solution;
    }
}