class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000;
        int num = n / 10;
        if (num > 0) {
            answer = answer - (num * 2000);
        }
        
        return answer;
    }
}