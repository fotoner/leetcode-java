package A1000A2000.S1975MaximumMatrixSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test1 (){
        //given
        int[][] matrix ={{1,2,3},{-1,-2,-3},{1,2,3}};
        //when
        long result = new Solution().maxMatrixSum(matrix);
        //then
        Assertions.assertEquals(16, result);
    }
    @Test
    void test2 (){
        //given
        int[][] matrix ={{1,-1},{-1,1}};
        //when
        long result = new Solution().maxMatrixSum(matrix);
        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void test3 (){
        //given
        int[][] matrix ={{1,1,1},{1,1,1},{1,1,1}};
        //when
        long result = new Solution().maxMatrixSum(matrix);
        //then
        Assertions.assertEquals(9, result);
    }

    @Test
    void test4 (){
        //given
        int[][] matrix ={{1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        //when
        long result = new Solution().maxMatrixSum(matrix);
        //then
        Assertions.assertEquals(9, result);
    }
}
