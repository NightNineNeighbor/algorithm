package zoom.no3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String S) {
        // write your code in Java SE 8
        List<Character> list = new ArrayList<>();


        int l = S.length();
        for (int i = 0; i < l; i++) {
            if (list.isEmpty()) {
                list.add(S.charAt(i));
            } else {
                if (list.get(list.size() - 1) == S.charAt(i)) {
                    list.remove(list.size() - 1);
                }else{
                    list.add(S.charAt(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }

        return sb.toString();
    }
}
