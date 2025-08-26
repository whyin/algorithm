class Solution {
    boolean solution(String s) {
        
        int answer = 0;
        int right = 0;
        
        for (char c : s.toCharArray()) {
            if (c == ')') answer--;
            else answer++;
            if (answer < 0) return false;
        }

        return answer == 0;
    }
}