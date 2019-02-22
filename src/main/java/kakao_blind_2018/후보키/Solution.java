package kakao_blind_2018.후보키;
import java.util.*;

class Solution {
    public int solution(String[][] relation) {
        int max = relation[0].length;

        ArrayList<Integer> candidate = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            candidate.add(i);
        }


        int ret = 0;
        for (int i = 1;  candidate.size() >= i && i <= max; i++) {
            Combination c = new Combination(candidate, relation);
            c.doCombination(candidate.size(), i,0 );

            Set<Integer> picked = c.picked;

            for (Integer integer : picked) {
                candidate.remove(integer);
            }

            ret += c.cnt;

        }
        return ret;
    }

    class Combination{
        private List<Integer> arr;
        private Stack<Integer> st;
        private String[][] relation;
        Set<Integer> picked = new HashSet<>();
        int cnt;

        public Combination(List<Integer> arr, String[][] relation){
            this.arr = arr;
            st = new Stack<Integer>();
            this.relation = relation;
        }
        public void showStack(){
            List<String> list = new ArrayList<>();
            for (String[] strings : relation) {
                StringBuilder sb = new StringBuilder();
                for (Integer integer : st) {
                    sb.append(strings[integer]);
                }

                if (list.contains(sb.toString())) {
                    return;
                }else{
                    list.add(sb.toString());
                }
            }

            for (Integer integer : st) {
                this.picked.add(integer);
            }
            this.cnt++;
        }

        public void doCombination(int n, int r, int index){
            // n : 전체 개수
            // r : 뽑을 개수
            // index 배열이다보니 현재 배열의 어디를 가리키고 있는지 필요하므로.
            if(r==0){
                showStack();
                return;
            }
            else if(n==r){
                for(int i=0;i<n;i++)st.add(arr.get(index+i));
                showStack();
                for(int i=0;i<n;i++)st.pop();
            }
            else{
                st.add(arr.get(index));
                doCombination(n-1,r-1,index+1);


                st.pop();
                doCombination(n-1, r, index+1);
            }
        }
    }




}
