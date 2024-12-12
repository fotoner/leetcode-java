package contest.WeeklyContest427.Q1;

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];

            if (curNum == 0){
                result[i] = 0;
            }
            else if(curNum > 0) {
                result[i] = nums[(i + curNum) % nums.length];
            } else {
                System.out.println((i + curNum + nums.length) % nums.length);
                result[i] = nums[Math.abs(i + curNum + nums.length) % nums.length];
            }
        }

        return result;
    }
}