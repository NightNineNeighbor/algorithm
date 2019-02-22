package zoom.pratice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] A = {1, 2, 3};
        int ret = s.solution(A);
        assertThat(ret).isEqualTo(4);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] A = {-1,- 3};
        int ret = s.solution(A);
        assertThat(ret).isEqualTo(1);
    }
}