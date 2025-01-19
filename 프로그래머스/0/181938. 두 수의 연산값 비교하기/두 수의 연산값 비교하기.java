class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ans1 = Integer.parseInt("" + a + b);
        int ans2 = 2 * a * b;
        answer = (ans1 > ans2) ? ans1 : ans2; 
        
        return answer;
    }
}