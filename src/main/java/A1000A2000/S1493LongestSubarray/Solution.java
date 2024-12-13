package A1000A2000.S1493LongestSubarray;

class Solution {
    public int longestSubarray(int[] nums) {
        int maxCount = 0;
        int curCount = 0;
        int lastDeleted = 0;

        for (int i = 0; i < nums.length; i++) {
            int curValue = nums[i];

            if(curValue == 0){
                curCount = i - lastDeleted;
                lastDeleted = i + 1;
                continue;
            }

            curCount++;
            maxCount = Math.max(curCount, maxCount);
        }
        return (lastDeleted == 0)? maxCount - 1 : maxCount;
    }
}