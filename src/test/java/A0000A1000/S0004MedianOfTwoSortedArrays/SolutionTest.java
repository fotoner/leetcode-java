package A0000A1000.S0004MedianOfTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test1() {
        //given
        int[] nums1 = {1, 3}, nums2 = {2};
        //when
        double result = new Solution().findMedianSortedArrays(nums1, nums2);
        //then
        assertEquals( 2.0, result);
    }

    @Test
    void test2() {
        //given
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        //when
        double result = new Solution().findMedianSortedArrays(nums1, nums2);
        //then
        assertEquals( 2.5, result);
    }
}
