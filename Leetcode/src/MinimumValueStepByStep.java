public class MinimumValueStepByStep {

    /**
     * Binary search O(n * log(mn)) log(mn) binary searches
     */
    public static int minStartValueBinSearch(int[] nums) {
        int numElem = nums.length;
        int max = 100;
        int left = 1;
        int right = max * numElem + 1;

        while (left < right) {
            int middle = (left + right) / 2;
            int start = middle;
            boolean isValid = true;

            for (int num : nums) {
                start += num;
                if (start < 1) {
                    isValid = false;
                    left = middle + 1;
                    break;
                }
            }
            if (isValid)
                right = middle;
        }
        return left;
    }

    /**
     * Using 0 as start, find smallest step difference minVal + 1 will be required
     * value
     */
    public static int minStartValuePrefix(int[] nums) {
        int total = 0;
        int minVal = 0;
        for (int num : nums) {
            total += num;
            minVal = Math.min(total, minVal);
        }
        return Math.abs(minVal) + 1;
    }
}
