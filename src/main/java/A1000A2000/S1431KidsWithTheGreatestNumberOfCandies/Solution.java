package A1000A2000.S1431KidsWithTheGreatestNumberOfCandies;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        LinkedList<Boolean> result = new LinkedList<>();

        for (int count: candies) {
            maxCandies = Math.max(maxCandies, count);
        }
        for (int count: candies) {
            result.add(count + extraCandies >= maxCandies);
        }

        return result;
    }
}