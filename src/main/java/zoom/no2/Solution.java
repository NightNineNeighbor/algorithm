package zoom.no2;

public class Solution {
    public int solution(int N, int K) {
        // N  : leaving chip
        // K  : max all-in
        return recursive(N, 0, K);
    }

    private int recursive(int chip, int cnt, int remindAllIn) {
        if (chip == 1) {
            return cnt;
        }
        if (remindAllIn == 0) {
            return cnt + chip - 1;
        }
        if (chip % 2 == 0) {
            return recursive(chip / 2, cnt + 1, remindAllIn - 1);
        } else {
            return recursive(chip - 1, cnt + 1, remindAllIn);
        }
    }
}
