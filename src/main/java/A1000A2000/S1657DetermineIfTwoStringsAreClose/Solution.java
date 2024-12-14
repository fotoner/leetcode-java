package A1000A2000.S1657DetermineIfTwoStringsAreClose;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

// 풀고나서 보니까 굳이 해쉬맵 쓸 필요가 없었는 듯
class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<String, Integer> firstMap = new HashMap<>();
        HashMap<String, Integer> secondMap = new HashMap<>();

        if(word1.length() != word2.length()) {
            return false;
        }
        for (String s : word1.split("")) {
            firstMap.compute(s, (k, v) -> v == null? 1 : v + 1);
        }
        for (String s : word2.split("")) {
            if(!firstMap.containsKey(s)){
                return false;
            }
            secondMap.compute(s, (k, v) -> v == null? 1 : v + 1);
        }

        ArrayList<Integer> firstValues = new ArrayList<>(firstMap.values());
        ArrayList<Integer> secondValues = new ArrayList<>(secondMap.values());

        Collections.sort(firstValues);
        Collections.sort(secondValues);

        for (int i = 0; i < firstValues.size(); i++) {
//            if(firstValues.get(i) != secondValues.get(i)){
            if(!Objects.equals(firstValues.get(i), secondValues.get(i))){
                return false;
            }
        }

        return true;
    }
}