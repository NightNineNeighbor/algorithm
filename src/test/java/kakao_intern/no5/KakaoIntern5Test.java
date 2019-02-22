package kakao_intern.no5;

import kakao_intern.no5.Solution;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KakaoIntern5Test {
    @Test
    public void test1() {
        int[][] land = {{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}};
        int height = 3;
        Solution s = new Solution();
        int ret = s.solution(land, height);
        assertThat(ret).isEqualTo(15);
    }

    @Test
    public  void test2(){
        int[][] land = {{10, 11, 10, 11}, {2, 21, 20, 10}, {1, 20, 21, 11}, {2, 1, 2, 1}};
        int height = 1;
        Solution s = new Solution();
        int ret = s.solution(land, height);
        assertThat(ret).isEqualTo(18);
    }
}