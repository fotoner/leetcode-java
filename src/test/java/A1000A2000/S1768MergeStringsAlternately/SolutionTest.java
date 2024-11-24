package A1000A2000.S1768MergeStringsAlternately;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test1 (){
        //given
        String word1 = "abc";
        String word2 = "pqr";
        //when
        String result = new Solution().mergeAlternately(word1, word2);
        //then
        Assertions.assertEquals("apbqcr", result);
    }

    @Test
    void test2 (){
        //given
        String word1 = "ab";
        String word2 = "pqrs";
        //when
        String result = new Solution().mergeAlternately(word1, word2);
        //then
        Assertions.assertEquals("apbqrs", result);
    }

    @Test
    void test3 (){
        //given
        String word1 = "abcd";
        String word2 = "pq";
        //when
        String result = new Solution().mergeAlternately(word1, word2);
        //then
        Assertions.assertEquals("apbqcd", result);
    }
}
