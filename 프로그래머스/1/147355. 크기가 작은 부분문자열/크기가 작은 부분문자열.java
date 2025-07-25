import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int tLen = t.length();
        int pLen = p.length();
        int answer = 0;

        for (int i = 0; i <= tLen - pLen ; i++) {
            String sub = t.substring(i, i + pLen);
            if (sub.compareTo(p) <= 0){
                answer++;
            }
        }
        return answer;
    }
}