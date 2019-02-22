package 카카오_2017_예선.카카오프렌즈_컬러링북;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 카카오프렌즈_컬러링북_Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] input = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int[] ret = s.solution(6, 4, input);
        int[] ans = {4, 5};
        assertThat(ret).isEqualTo(ans);

    }
}
