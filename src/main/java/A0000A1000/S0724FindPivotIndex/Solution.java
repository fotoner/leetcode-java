package A0000A1000.S0724FindPivotIndex;

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int curValue = nums[i];

            rightSum -= curValue;

            if(leftSum == rightSum) {
                return i;
            }

            leftSum += curValue;
        }
        return -1;
    }
}