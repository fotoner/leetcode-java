package A1000A2000.S1004MaxConsecutiveOnes3;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0;
        int curLength = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            } else if (zeroCount < k) {
                zeroCount++;
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            } else if (zeroCount == k) {
                while (zeroCount == k) {
                    if(nums[start] == 0) {
                        zeroCount--;
                    }
                    curLength--;
                    start++;
                }
                zeroCount++;
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            }
        }

        return maxLength;
    }
}