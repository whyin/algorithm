class Solution {
    public int solution(int a, int b) {
        int answer = 0;
                int ans1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b)); 
        int ans2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if (ans1 > ans2) {
            answer = ans1;
        } else {
            answer = ans2;
        }
        return answer;
    }
}