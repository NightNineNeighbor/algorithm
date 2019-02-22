package kakao_intern.no3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KakaoIntern3Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int N = 3;
        int[] coffee = {4, 2, 2, 5, 3};

        int[] ret = s.solution(N, coffee);
        int[] ans = {2, 3, 1, 5, 4};
        assertThat(ret).isEqualTo(ans);

    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int N = 1;
        int[] coffee = {100, 1, 50, 1, 1};

        int[] ret = s.solution(N, coffee);
        int[] ans = {1, 2, 3, 4, 5};
        assertThat(ret).isEqualTo(ans);
    }
}