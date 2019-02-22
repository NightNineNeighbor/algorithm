package programmers.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {
    public int[] solution(int[] arr) {
        LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
        for (int i : arr) {
            lhs.add(i);
        }
        ArrayList<Integer> ret = new ArrayList<>();
        for (Integer integer : lhs) {
            ret.add(integer);
        }

        return ret.stream().mapToInt(i -> i).toArray();
    }
}
