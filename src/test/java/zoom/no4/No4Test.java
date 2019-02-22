package zoom.no4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No4Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] A = {
                {5, 4, 4},
                {4, 3, 4},
                {3, 2, 4},
                {2, 2, 2},
                {3, 3, 4},
                {1, 4, 4},
                {4, 1, 1}
        };
        int ret = s.solution(A);
        assertThat(ret).isEqualTo(11);
    }
}