package A1000A2000.S1207UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        HashSet<Integer> checkSet = new HashSet<>();

        for (int num : arr) {
            if(numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        for (Integer value : numCount.values()) {
            if(checkSet.contains(value)) {
                return false;
            } else {
                checkSet.add(value);
            }
        }
        return  true;
    }
}