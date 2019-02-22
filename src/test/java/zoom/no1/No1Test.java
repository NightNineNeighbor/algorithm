package zoom.no1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No1Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int ret = s.solution(125);
        assertThat(ret).isEqualTo(100);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int ret = s.solution(1);
        assertThat(ret).isEqualTo(0);
    }
}