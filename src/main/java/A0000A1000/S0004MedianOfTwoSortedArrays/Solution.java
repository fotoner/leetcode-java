package A0000A1000.S0004MedianOfTwoSortedArrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int INF = 987654321;
        int m = nums1.length;
        int n = nums2.length;
        if (nums1.length > nums2.length) {
            return this.findMedianSortedArrays(nums2, nums1);
        }

        int left = 0;
        int right = m;
        int partition = (m + n + 1) / 2;

        while (left <= right) {
            int p1 = (left + right) / 2;
            int p2 = partition - p1;

            int nums1Max = (p1 > 0)? nums1[p1 - 1] : -INF;
            int nums1Min = (p1 < m)? nums1[p1] : INF;

            int nums2Max = (p2 > 0)? nums2[p2 - 1] : -INF;
            int nums2Min = (p2 < n)? nums2[p2] : INF;

            if(nums1Max <= nums2Min && nums2Max <= nums1Min) {
                if((m + n) % 2 == 0) {
                    return ((double) Math.max(nums1Max, nums2Max) + Math.min(nums1Min, nums2Min)) / 2;
                } else {
                    return Math.max(nums1Max, nums2Max);
                }
            } else if (nums1Max > nums2Min) {
                right = p1 - 1;
            } else {
                left = p1 + 1;
            }
        }

        return  0.0;
    }
}