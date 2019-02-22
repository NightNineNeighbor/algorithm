package zoom.pratice;

public class Solution {
    public int solution(int[] A) {
        boolean[] booleans = new boolean[1_000_003];
        // write your code in Java SE 8
        for (int i : A) {
            if (i >= 0) {
                booleans[i] = true;
            }
        }

        int i = 1;
        while (true) {
            if (!booleans[i]) {
                return i;
            }
            i++;

        }
    }
}
