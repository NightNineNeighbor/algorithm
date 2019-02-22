package zoom.no4;

public class Solution {
    private static int[] momentX = {1, -1, 0, 0};
    private static int[] momentY = {0, 0, 1, -1};
    public int solution(int[][] A) {
        int X = A.length;
        int Y = A[0].length;
        boolean[][] isVisited = new boolean[X][Y];

        int cnt = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (!isVisited[i][j]) {
                    drawSame(i, j, A[i][j],A, isVisited);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private void drawSame(int x, int y, int color,int[][] map, boolean[][] isVisited) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + momentX[i];
            int nextY = y + momentY[i];

            if (nextX < 0 || nextY < 0 || nextX >= isVisited.length || nextY >= isVisited[0].length) {
                continue;
            }
            if (!isVisited[nextX][nextY] && map[nextX][nextY] == color) {
                isVisited[nextX][nextY] = true;
                drawSame(nextX, nextY, color, map, isVisited);
            }
        }
    }


}
