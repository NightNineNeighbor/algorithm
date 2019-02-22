package 카카오_2017_예선.카카오프렌즈_컬러링북;


public class Solution {
    private static int[] mX = {1, -1, 0, 0};
    private static int[] mY = {0, 0, 1, -1};

    public int[] solution(int m, int n, int[][] picture) {
        int[] a1 = {1, -1, 0, 0};
        int[] a2 = {0, 0, 1, -1};
        mX = a1;
        mY = a2;
        boolean[][] isVisited = new boolean[m][n];

        int ret = 0;
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isVisited[i][j] || picture[i][j] == 0) {
                    isVisited[i][j] = true;
                    continue;
                }
                cnt++;
                int max = 0;
                isVisited[i][j] = true;
                max += search(i, j, picture[i][j], isVisited, picture);
                ret = Math.max(ret, max);

            }
        }
        int[] r = {cnt, ret};
        return r;
    }

    private int search(int i, int j, int type, boolean[][] isVisited, int[][] picture) {
        if (picture[i][j] != type) {
            return 0;
        }
        isVisited[i][j] = true;
        int max = 1;
        for (int k = 0; k < 4; k++) {
            int nextX = i + mX[k];
            int nextY = j + mY[k];
            if (nextX >= 0 && nextX < isVisited.length && nextY >= 0 && nextY < isVisited[0].length && !isVisited[nextX][nextY]) {
                max += search(nextX, nextY, type, isVisited, picture);
            }
        }
        return max;
    }
}
