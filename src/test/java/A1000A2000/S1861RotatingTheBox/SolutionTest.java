package A1000A2000.S1861RotatingTheBox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test1 (){
        //given
        char[][] box = {{'#','.','#'}};
        //when
        char[][] result = new Solution().rotateTheBox(box);
        //then
        char[][] expected = {{'.'},
                            {'#'},
                            {'#'}};
        assertArrayEquals(expected, result);
    }

    @Test
    void test2 (){
        //given
        char[][] box = {{'#','.','*','.'},
                {'#','#','*','.'}};
        //when
        char[][] result = new Solution().rotateTheBox(box);
        //then
        char[][] expected = {{'#','.'},
                {'#','#'},
                {'*','*'},
                {'.','.'}};
        assertArrayEquals(expected, result);
    }

    @Test
    void test3 (){
        //given
        char[][] box = {{'#','#','*','.','*','.'},
                {'#','#','#','*','.','.'},
                {'#','#','#','.','#','.'}};
        //when
        char[][] result = new Solution().rotateTheBox(box);
        //then
        char[][] expected = {{'.','#','#'},
                {'.','#','#'},
                {'#','#','*'},
                {'#','*','.'},
                {'#','.','*'},
                {'#','.','.'}};
        assertArrayEquals(expected, result);
    }
}
