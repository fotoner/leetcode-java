package A0000A1000.S0643MaximumAverageSubarray1;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k - 1; i++) {
            tempSum += nums[i];
        }

        for (int i = k - 1; i < nums.length; i++) {
            int curSum = tempSum + nums[i];
            maxSum = Math.max(curSum, maxSum);
            tempSum = curSum - nums[i - k + 1];
        }

        return (double) maxSum / k;
    }
}