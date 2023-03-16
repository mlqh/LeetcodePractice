package Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1; 
        int indx = 1, curr = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != curr) {
                count++;
                curr = nums[i];
                nums[indx] = curr;
                indx++;
            }
        }
        return count;
    }
}