package contest.WeeklyContest425.S3366;

import java.util.Arrays;

// FAIL
// 3366. Minimum Array Sum

// 정렬한 후의 가장 큰 값을 하나씩 처리해가면 될줄 알았으나 그렇지 않았음,
// 후에 찾아보니 DP를 활용해 푼 사례가 많은 걸 보아 DP를 활용해야 했었던 것 같음
class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        int size = nums.length;
        int sum = 0;
        Arrays.sort(nums);

        for (int i = size - 1; i > -1; i--) {
            if(op1 > 0) {
                if (nums[i] - 3 < Math.round((float) nums[i] / 2)) {
                    nums[i] = Math.round((float) nums[i] / 2);
                    op1--;
                }
            }
            else {
                break;
            }
        }
        for (int i = size - 1; i > -1; i--) {
            if(op2 > 0) {
                if(nums[i] - k >= 0){
                    nums[i] = nums[i] - k;
                    op2--;
                }
            } else {
                break;
            }
        }
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}