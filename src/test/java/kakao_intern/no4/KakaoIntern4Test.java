package kakao_intern.no4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KakaoIntern4Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        int K = 3;
        String[] score = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};

        int ret = s.solution(K, score);
        assertThat(ret).isEqualTo(4);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int K = 3;
        String[] score = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};

        int ret = s.solution(K, score);
        assertThat(ret).isEqualTo(3);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int K = 2;
        String[] score = {"cheries2 200", "alex111 100", "coco 150", "puyo 120"};

        int ret = s.solution(K, score);
        assertThat(ret).isEqualTo(3);
    }
}