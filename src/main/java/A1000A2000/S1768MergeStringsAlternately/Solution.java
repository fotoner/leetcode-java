package A1000A2000.S1768MergeStringsAlternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word1.length() > word2.length()) {
            String subString = word1.substring(word2.length());

            return mergeAlternately(word1.substring(0, word2.length()), word2 + subString);
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        result.append(word2.substring(word1.length()));

        return result.toString();
    }
}