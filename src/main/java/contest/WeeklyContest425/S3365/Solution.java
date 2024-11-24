package contest.WeeklyContest425.S3365;

import java.util.HashMap;

// SOLVED
// 3365. Rearrange K Substrings to Form Target String
class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        HashMap<String, Integer> substringMap = new HashMap<>();
        int parseSize = s.length() / k;

        for (int i = 0; i * parseSize< s.length(); i++) {
            String curSub = s.substring(i * parseSize, (i + 1) * parseSize);

            if(substringMap.containsKey(curSub)){
                substringMap.put(curSub,substringMap.get(curSub) + 1);
            }
            else {
                substringMap.put(curSub, 1);
            }
        }
        for (int i = 0; i * parseSize < s.length(); i++) {
            String curSub = t.substring(i * parseSize, (i + 1) * parseSize);

            if(!substringMap.containsKey(curSub)) {
                return false;
            } else {
                int curValue = substringMap.get(curSub);

                if(curValue == 0) {
                    return false;
                }
                else {
                    substringMap.put(curSub,curValue - 1);
                }
            }
        }
        return true;
    }
}