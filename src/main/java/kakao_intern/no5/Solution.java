package kakao_intern.no5;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] land, int height) {
        int N = land.length;
        int[] mX = {0, 0, 1, -1};
        int[] mY = {1, -1, 0, 0};
        int[][] distance = new int[N][N];
        boolean[][] isVisited = new boolean[N][N];

        for (int[] ints : distance) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }

        distance[0][0] = 0;
        PriorityQueue<Element> pq = new PriorityQueue<>();
        pq.add(new Element(0, 0, 0));

        int ret = 0;
        int cnt = 0;
        Element here = null;
        while (cnt != N * N) {
            cnt++;
            here = pq.poll();
            while (isVisited[here.x][here.y]) {
                here = pq.poll();
            }
            int x = here.x;
            int y = here.y;
            ret += here.dist;

            for (int i = 0; i < 4; i++) {
                int nextX = x + mX[i];
                int nextY = y + mY[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= N) {
                    continue;
                }
                if (isVisited[nextX][nextY]) {
                    continue;
                }


                int c = Math.abs(land[x][y] - land[nextX][nextY]);
                pq.add(new Element(nextX, nextY, c > height ? c : 0));
//                if (distance[x][y] + (c > height ? c : 0)
//                        < distance[nextX][nextY]) {
//                    distance[nextX][nextY] = distance[x][y] + (c > height ? c : 0);
//                    pq.add(new Element(nextX, nextY, c > height ? c : 0));
//                }
            }
            isVisited[x][y] = true;
        }


        return ret;
    }

    public class Element implements Comparable<Element> {
        int x;
        int y;
        Integer dist;

        public Element(int x, int y, Integer dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "x=" + x +
                    ", y=" + y +
                    ", dist=" + dist +
                    '}';
        }

        @Override
        public int compareTo(Element o) {
            return this.dist.compareTo(o.dist);
        }
    }
}
