package kakao_intern.no1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KakaoIntern1Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        String phone = "01012345678";
        int ret = s.solution(phone);
        assertThat(ret).isEqualTo(2);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String phone = "010-1212-333";
        int ret = s.solution(phone);
        assertThat(ret).isEqualTo(-1);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String phone = "+82-10-3434-2323";
        int ret = s.solution(phone);
        assertThat(ret).isEqualTo(3);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        String phone = "+82-010-3434-2323";
        int ret = s.solution(phone);
        assertThat(ret).isEqualTo(-1);
    }
}