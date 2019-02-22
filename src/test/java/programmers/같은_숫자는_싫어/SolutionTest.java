package programmers.같은_숫자는_싫어;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void test1() {

        Solution s = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] ret = s.solution(arr);

        int[] ans = {1, 3, 0, 1};
        assertThat(ret).isEqualTo(ans);
    }
}