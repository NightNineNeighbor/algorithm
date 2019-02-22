package kakao_blind_2018.무지의_먹방_라이브;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 무지의_먹방_라이브_Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] times = {3, 1, 2};
        int ret = s.solution(times, 5);
        assertThat(ret).isEqualTo(1);
    }
}