package kakao_intern.no2;

import java.util.HashMap;

public class Solution {
    public int solution(String[] moves) {
        int x = 0;
        int y = 0;
        HashMap<String, Point> map = new HashMap<>();

        int length = moves.length;
        for (int i = 0; i < length; i++) {
            char c = moves[i].charAt(0);
            if (c == 'U') {
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.U = true;
                } else {
                    Point p = new Point();
                    p.U = true;
                    map.put(str(x, y), p);
                }
                y++;
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.D = true;
                } else {
                    Point p = new Point();
                    p.D = true;
                    map.put(str(x, y), p);
                }
            } else if (c == 'D') {
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.D = true;
                } else {
                    Point p = new Point();
                    p.D = true;
                    map.put(str(x, y), p);
                }
                y--;
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.U = true;
                } else {
                    Point p = new Point();
                    p.U = true;
                    map.put(str(x, y), p);
                }
            } else if (c == 'R') {
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.R = true;
                } else {
                    Point p = new Point();
                    p.R = true;
                    map.put(str(x, y), p);
                }
                x++;
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.L = true;
                } else {
                    Point p = new Point();
                    p.L = true;
                    map.put(str(x, y), p);
                }
            } else if (c == 'L') {
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.L = true;
                } else {
                    Point p = new Point();
                    p.L = true;
                    map.put(str(x, y), p);
                }
                x--;
                if (map.containsKey(str(x, y))) {
                    Point p = map.get(str(x, y));
                    p.R = true;
                } else {
                    Point p = new Point();
                    p.R = true;
                    map.put(str(x, y), p);
                }
            }
        }//for end
        int cnt = 0;
        for (String s : map.keySet()) {
            Point p = map.get(s);
            if (p.D && p.R) {
                String[] ss = s.split(",");
                String xx = String.valueOf((Integer.parseInt(ss[0]) + 1));
                String yy = String.valueOf((Integer.parseInt(ss[1]) - 1));
                Point pp = map.get(xx + "," + yy);
                if (pp != null && pp.U && pp.L) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private String str(int x, int y) {
        return String.valueOf(x) + "," + String.valueOf(y);
    }

    public class Point {
        boolean U, D, R, L;

        Point() {
            U = false;
            D = false;
            R = false;
            L = false;
        }
    }

}
