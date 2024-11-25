package A1000A2000.S1071GreatestCommonDivisorOfStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test1 (){
        //given
        String word1 = "ABCABC";
        String word2 = "ABC";
        //when
        String result = new Solution().gcdOfStrings(word1, word2);
        //then
        Assertions.assertEquals("ABC", result);
    }

    @Test
    void test2 (){
        //given
        String word1 = "ABABAB";
        String word2 = "ABAB";
        //when
        String result = new Solution().gcdOfStrings(word1, word2);
        //then
        Assertions.assertEquals("AB", result);
    }

    @Test
    void test3 (){
        //given
        String word1 = "LEET";
        String word2 = "CODE";
        //when
        String result = new Solution().gcdOfStrings(word1, word2);
        //then
        Assertions.assertEquals("", result);
    }
}
