package kakao_intern.no2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KakaoIntern2Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        String[] moves = {"U", "R", "D", "L", "U", "R", "D", "L"};
        int ret = s.solution(moves);
        assertThat(ret).isEqualTo(1);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String[] moves = {"U", "U", "R", "D", "L", "L", "L", "U", "R", "D", "D", "D", "L", "U", "R", "R", "R", "D", "L", "U"};
        int ret = s.solution(moves);
        assertThat(ret).isEqualTo(5);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String[] moves = {"U", "L", "D", "R", "R", "D", "D", "L", "U", "U"};
        int ret = s.solution(moves);
        assertThat(ret).isEqualTo(1);
    }
}