package A0000A1000.S0238ProductOfArrayExceptSelf;

import java.util.ArrayList;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int product = 1;
        
        for (int num: nums) {
            list.add(product);
            product *= num;
        }

        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int curNum = nums[i];
            nums[i] = product * list.get(i);
            product *= curNum;
        }

        return nums;
    }
}