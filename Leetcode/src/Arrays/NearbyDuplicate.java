package Arrays;

import java.util.HashMap;
import java.util.HashSet;

/*
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */

public class NearbyDuplicate {

    // my initial soln
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if(Math.abs(map.get(nums[i]) - i) <= k) return true;
                map.replace(nums[i], i);
            }
        }
        return false;
    }

    // proper sliding window
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > k) {
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
