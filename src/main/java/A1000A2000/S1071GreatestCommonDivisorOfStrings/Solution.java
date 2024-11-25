package A1000A2000.S1071GreatestCommonDivisorOfStrings;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String comb1 = str1 + str2;
        String comb2 = str2 + str1;

        if(!comb2.equals(comb1)){
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}