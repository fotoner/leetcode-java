package A0000A1000.S0151ReverseWordsInaString;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String reverseWords(String s) {
        List<String> list = Arrays.asList(s.trim().split(" "));
        Collections.reverse(list);

        return list.stream().filter(word -> !word.equals("")).collect(Collectors.joining(" "));
    }
}