package kakao_intern.no1;

public class Solution {
    public int solution(String phone) {
        if (phone.indexOf("010-") == 0 && phone.length() == 13) {
            phone = phone.substring(4);
            for (int i = 0; i < 3; i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    return -1;
                }
            }
            if (phone.charAt(4) != '-') {
                return -1;
            }
            for (int i = 5; i <= 8; i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    return -1;
                }
            }
            return 1;
        } else if (phone.indexOf("010") == 0 && phone.length() == 11) {
            phone = phone.substring(3);
            for (int i = 0; i <= 7; i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    return -1;
                }
            }
            return 2;
        } else if (phone.indexOf("+82-10-") == 0 && phone.length() == 16) {
            phone = phone.substring(7);
            for (int i = 0; i <= 3; i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    return -1;
                }
            }
            if (phone.charAt(4) != '-') {
                return -1;
            }
            for (int i = 5; i <= 8; i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    return -1;
                }
            }
            return 3;
        }
        return -1;
    }
}
