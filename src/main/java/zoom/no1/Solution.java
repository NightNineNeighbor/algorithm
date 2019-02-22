package zoom.no1;

public class Solution {
    int solution(int N) {
        String S = Integer.toString(N);
        if (S.length() == 1) {
            return 0;
        }
        return (int) Math.pow(10, S.length() - 1);
    }
}
