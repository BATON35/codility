import OddOccurrenclesInArray.Solution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setup(){
        solution = new Solution();}

    @Test
    public void testSimpleArray() {
        int[] array = new int[]{9, 3, 9, 3, 9, 7, 9};

        assertEquals(7, solution.solution(array));
    }
}
