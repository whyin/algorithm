class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = 0;
        int same = 0, diff = 0;
        char pivot = s.charAt(0);
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == pivot) same++;
            else diff++;
            
            if (same == diff) {
                answer++;
                same = 0; diff = 0;
                if (i + 1 < n) pivot = s.charAt(i + 1);
            }
        }
        if (same != diff) answer++;
        return answer;
    }
}