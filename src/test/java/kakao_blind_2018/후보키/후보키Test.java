package kakao_blind_2018.후보키;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 후보키Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        String[][] input = {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}};
        int ret = s.solution(input);
        assertThat(ret).isEqualTo(2);
    }
}