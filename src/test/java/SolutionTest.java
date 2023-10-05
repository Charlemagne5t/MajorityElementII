import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void majorityElementTest1() {
        int[] nums = {3, 2, 3};
        List<Integer> expected = new ArrayList<>(List.of(3));
        List<Integer> actual = new Solution().majorityElement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void majorityElementTest2() {
        int[] nums = {1};
        List<Integer> expected = new ArrayList<>(List.of(1));
        List<Integer> actual = new Solution().majorityElement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void majorityElementTest3() {
        int[] nums = {1, 2};
        List<Integer> expected = new ArrayList<>(List.of(1, 2));
        List<Integer> actual = new Solution().majorityElement(nums);

        Assert.assertEquals(expected, actual);
    }
}
