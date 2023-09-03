package Arrays;

/*
 * https://leetcode.com/problems/merge-sorted-array/description/
 * Compare largest elements of each array and move to end of nums1
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n <= 0) return;
        int firstp = m - 1;
        int secondp = n - 1;
        int p = m + n - 1;
        while(secondp >= 0) {
            if(firstp >= 0 && nums1[firstp] > nums2[secondp]) {
                nums1[p--] = nums1[firstp--];
            } else {
                nums1[p--] = nums2[secondp--];
            }
        }
    }
}
