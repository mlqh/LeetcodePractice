package Arrays;

import java.util.ArrayList;

public class SubsetSum {
    /**
     * Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. If such a subset cannot be made, then return null.
     * Integers can appear more than once in the list. You may assume all numbers in the list are positive.
     * For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.
     */

    public static boolean subsetSumRecurse(int[] array, int target) {
        return recurseHelper(array, target, 0);
    }

    public static boolean recurseHelper(int[] array, int target, int i) {
        if(target == 0) return true;
        if(i == array.length) return false;
        if(array[i] > target) {
            return recurseHelper(array, target, i + 1);
        } else {
            return recurseHelper(array, target - array[i], i + 1) || recurseHelper(array, target, i + 1);
        }
    }

    public static boolean subsetSumDP(int[] array, int target) {
        if(target == 0) return true;
        if(array.length == 0) return false;

        int[][] dp = new int[target + 1][array.length + 1];
        return false;
    }
}
