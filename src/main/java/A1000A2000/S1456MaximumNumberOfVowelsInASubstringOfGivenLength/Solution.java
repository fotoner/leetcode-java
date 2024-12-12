package A1000A2000.S1456MaximumNumberOfVowelsInASubstringOfGivenLength;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int maxVowels(String s, int k) {
        HashSet<String> vowels = new HashSet<>(Arrays.asList("aeiou".split("")));
        int[] isVowels = Arrays.stream(s.split("")).mapToInt(value -> (vowels.contains(value))? 1 : 0).toArray();

        int maxCount = 0;
        int tempCount = 0;

        for (int i = 0; i < k - 1; i++) {
            if(isVowels[i] == 1) {
                tempCount += isVowels[i];
            }
        }
        for (int i = k - 1; i < isVowels.length; i++) {
            int curCount = tempCount + isVowels[i];
            maxCount = Math.max(curCount, maxCount);

            tempCount = curCount - isVowels[i - (k - 1)];
        }

        return maxCount;
    }
}