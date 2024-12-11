package A0000A1000.S0392IsSubsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;

        if(s.length() == 0){
            return true;
        }

        for (char curChar : t.toCharArray()) {
            if (s.charAt(idx) == curChar) {
                idx++;
            }

            if(s.length() == idx) {
                return true;
            }
        }

        return false;
    }
}