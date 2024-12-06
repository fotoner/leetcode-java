package A0000A1000.S0345ReverseVowelsOfaString;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String reverseVowels(String s) {
        HashSet<String> vowels = new HashSet<>(Arrays.asList("aeiouAEIOU".split("")));
        String[] words = s.split("");

        int start = 0;
        int end = s.length() - 1;

        while (start < end){
            while (start < end && !vowels.contains(words[start])) {
                start++;
            }
            while (start < end && !vowels.contains(words[end])) {
                end--;
            }
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }

        return String.join("", words);
    }
}