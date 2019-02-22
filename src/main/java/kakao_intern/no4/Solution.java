package kakao_intern.no4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public int solution(int K, String[] score){
        int i = 0;
        int length = score.length;
        int cnt = 0;
        ArrayList<Rank> ranks = new ArrayList<>();
        HashMap<String, Rank> map = new HashMap<>();

        for (; i < length && ranks.size() < K; i++) {
            String[] ss = score[i].split(" ");
            if (map.containsKey(ss[0])) {
                Rank r = map.get(ss[0]);
                int aScore = Integer.parseInt(ss[1]);
                if (aScore > r.score) {
                    Collections.sort(ranks);
                    int prevRank = ranks.indexOf(r);
                    r.score = aScore;
                    r.index = i;
                    Collections.sort(ranks);
                    int postRank = ranks.indexOf(r);
                    if (prevRank != postRank) {
                        cnt++;
                    }
                }
            } else {
                Rank rr = new Rank(ss[0], i, Integer.parseInt(ss[1]));
                map.put(ss[0], rr);
                ranks.add(rr);
                cnt++;
            }
        }

        Collections.sort(ranks);

        while (i < length) {
            String[] ss = score[i].split(" ");
            int aScore = Integer.parseInt(ss[1]);
            Rank r = new Rank(ss[0], i, aScore);

            if (aScore > ranks.get(K - 1).score) {
                if (map.containsKey(ss[0])) {
                    r = map.get(ss[0]);
                    if (aScore > r.score) {
                        int prevRank = ranks.indexOf(r);
                        r.score = aScore;
                        r.index = i;
                        Collections.sort(ranks);
                        int postRank = ranks.indexOf(r);
                        if (prevRank != postRank) {
                            cnt++;
                        }
                    }
                }else{
                    map.put(ss[0], r);
                    ranks.add(r);
                    Collections.sort(ranks);
                    cnt++;
                }
            }
            i++;
        }
        return cnt;
    }

    public class Rank implements Comparable<Rank>{
        final String nickName;
        Integer index;
        Integer score;

        public Rank(String nickName, Integer index, Integer score) {
            this.nickName = nickName;
            this.index = index;
            this.score = score;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rank rank = (Rank) o;
            return Objects.equals(nickName, rank.nickName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nickName);
        }

        @Override
        public int compareTo(Rank o) {
            if (!o.score.equals(this.score)) {
                return o.score.compareTo(this.score);
            }
            return this.index.compareTo(o.index);
        }
    }
}
