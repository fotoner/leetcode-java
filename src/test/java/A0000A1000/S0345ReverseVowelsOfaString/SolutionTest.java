
package A0000A1000.S0345ReverseVowelsOfaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test1() {
        //given
        String s = "IceCreAm";
        //when
        String result = new Solution().reverseVowels(s);
        //then
        assertEquals("AceCreIm",result);
    }
    @Test
    void test2() {
        //given
        String s = "leetcode";
        //when
        String result = new Solution().reverseVowels(s);
        //then
        assertEquals("leotcede",result);
    }
}
