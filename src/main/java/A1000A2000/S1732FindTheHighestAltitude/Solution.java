package A1000A2000.S1732FindTheHighestAltitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int prefixSum = 0;
        int max = 0;

        for (int val : gain) {
            prefixSum += val;
            max = Math.max(max, prefixSum);
        }
        return max;
    }
}