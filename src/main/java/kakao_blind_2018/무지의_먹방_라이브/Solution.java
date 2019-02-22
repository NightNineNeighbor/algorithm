package kakao_blind_2018.무지의_먹방_라이브;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public int solution(int[] times, long k) {
        boolean[] isEaten = new boolean[times.length];
        long round = k % times.length;
        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i < times.length; i++) {
            list.add(new Pair(times[i], i));
        }

        Collections.sort(list);

        int cnt = 0;
        while (k >= list.size()) {
            Pair last = list.get(list.size() - 1);
            if(k - last.time * list.size()< 0){
                break;
            }
            isEaten[last.index] = true;
            k -= (last.time-cnt) * list.size();
            cnt = last.time;
            list.remove(list.size() - 1);
        }

        list.sort(Comparator.comparing((o) -> -o.index));

        int ret;
        while (!list.isEmpty() && k != 0) {
            for (int i = list.size(); i >= 0 && k >= 0; i++, --k) {
                if (list.get(i).time == cnt + 1) {
                    list.remove(i);
                }
                cnt++;
            }
        }

        if (k > 0) {
            return -1;
        }

        return 0;

    }

    class Pair implements Comparable<Pair>{
        Integer time;
        Integer index;

        public Pair(int time, int index) {
            this.time = time;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.time.equals(o.time)) {
                return o.index.compareTo(this.index);
            }
            return o.time.compareTo(this.time);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "time=" + time +
                    ", index=" + index +
                    '}';
        }
    }
}
