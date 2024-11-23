package A0000A1000.S0003LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test1() {
        //given
        String input = "abcabcbb";
        //when
        int result = new Solution().lengthOfLongestSubstring(input);
        //then
        assertEquals( 3, result);
    }

    @Test
    void test2() {
        //given
        String input = "bbbbb";
        //when
        int result = new Solution().lengthOfLongestSubstring(input);
        //then
        assertEquals( 1, result);
    }

    @Test
    void test3() {
        //given
        String input = "pwwkew";
        //when
        int result = new Solution().lengthOfLongestSubstring(input);
        //then
        assertEquals( 3, result);
    }

    @Test
    void test4() {
        //given
        String input = "dvdf";
        //when
        int result = new Solution().lengthOfLongestSubstring(input);
        //then
        assertEquals( 3, result);
    }
}
