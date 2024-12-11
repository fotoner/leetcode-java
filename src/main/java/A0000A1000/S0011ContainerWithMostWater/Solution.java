package A0000A1000.S0011ContainerWithMostWater;

class Solution {
//    TLE
//    public int maxArea(int[] height) {
//        int maxSize = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int curHeight = Math.min(height[i], height[j]);
//
//                maxSize = Math.max(maxSize, curHeight * (j - i));
//            }
//        }
//
//        return maxSize;
//    }
    public int maxArea(int[] height) {
        int leftIdx = 0;
        int rightIdx = height.length - 1;

        int maxSum = 0;

        while(leftIdx < rightIdx) {
            int curHeight = Math.min(height[leftIdx], height[rightIdx]);
            maxSum =Math.max(maxSum, curHeight * (rightIdx - leftIdx));

            if(height[leftIdx] > height[rightIdx]) {
                rightIdx--;
            } else {
                leftIdx++;
            }
        }

        return maxSum;
    }
}