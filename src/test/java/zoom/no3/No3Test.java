package zoom.no3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No3Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        String ret = s.solution("ACCAABBC");
        assertThat(ret).isEqualTo("AC");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String ret = s.solution("ABCBBCBA");
        assertThat(ret).isEqualTo("");
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String ret = s.solution("BABABA");
        assertThat(ret).isEqualTo("BABABA");
    }
}