package A0000A1000.S0443StringCompression;

class Solution {
    public int compress(char[] chars) {
        char targetChar = chars[0];
        int count = 0;
        StringBuilder resultBuilder = new StringBuilder();

        for (char curChar : chars) {
            if(targetChar == curChar) {
                count++;
            } else {
                resultBuilder.append(targetChar);
                if(count > 1) {
                    resultBuilder.append(count);
                }
                targetChar = curChar;
                count = 1;
            }
        }
        resultBuilder.append(targetChar);
        if(count > 1) {
            resultBuilder.append(count);
        }

        for (int i = 0; i < resultBuilder.length(); i++) {
            chars[i] = resultBuilder.charAt(i);
        }

        return resultBuilder.length();
    }
}