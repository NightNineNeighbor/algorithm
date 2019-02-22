public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        String ret = s.solution("try hello world");
        System.out.println(ret);
    }

    public String solution(String s) {
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                flag = true;
                continue;
            }
            if (flag) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                flag = false;
            } else {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                flag = true;
            }
        }


        return sb.toString();
    }
}
