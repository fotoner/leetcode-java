package A0000A1000.S0003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (charMap.containsKey(curChar)){
                start = Math.max(start, charMap.get(curChar) + 1);
            }
            charMap.put(curChar, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}