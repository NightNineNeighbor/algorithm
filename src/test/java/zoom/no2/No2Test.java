package zoom.no2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No2Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int ret = s.solution(8, 0);
        assertThat(ret).isEqualTo(7);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        int ret = s.solution(18, 2);
        assertThat(ret).isEqualTo(6);
    }
    @Test
    public void test3() {
        Solution s = new Solution();
        int ret = s.solution(10, 10);
        assertThat(ret).isEqualTo(4);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        int ret = s.solution(1, 10);
        assertThat(ret).isEqualTo(0);
    }
}