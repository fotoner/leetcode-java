package A1000A2000.S1679MaxNumberOfKSumPairs;

import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        Arrays.sort(nums);

        while (left < right) {
            if(nums[left] + nums[right] == k) {
                left++;
                right--;
                count++;
            }

            while ((left < nums.length) && (nums[left] + nums[right] < k)) {
                left++;
            }

            while ((right >= 0) && (nums[left] + nums[right] > k)) {
                right--;
            }
        }

        return count;
    }
}