package A1000A2000.S1975MaximumMatrixSum;

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long originalSum = 0;
        int negativeCount = 0;
        int minValue = Integer.MAX_VALUE;

        for(int[] row : matrix){
            for (int value :row){
                if(value < 0) {
                    negativeCount++;
                }
                originalSum += Math.abs(value);
                minValue = Math.min(minValue, Math.abs(value));
            }
        }

        if(negativeCount % 2 == 1) {
            originalSum -= minValue * 2;
        }

        return originalSum;
    }
}