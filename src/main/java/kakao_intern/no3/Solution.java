package kakao_intern.no3;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int N, int[] time) {
        int i = 0;
        int length = time.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (; i < N; i++) {
            pq.add(new Pair(i, time[i]));
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            list.add(pair.index);
            int t = pair.time;

            for (Pair p : pq) {
                p.time -= t;
            }

            while (!pq.isEmpty() && pq.peek().time == 0) {
                list.add(pq.poll().index);
            }

            for (; i < length && pq.size() < N; i++) {
                pq.add(new Pair(i, time[i]));
            }
        }

        return list.stream().mapToInt(x -> x + 1).toArray();
    }

    public class Pair implements Comparable<Pair> {
        Integer index;
        Integer time;

        public Pair(Integer index, Integer time) {
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Pair o) {
            if (!this.time.equals(o.time)) {
                return this.time.compareTo(o.time);
            }
            return this.index.compareTo(o.index);
        }
    }
}
