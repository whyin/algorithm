class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n < 2) return 0;
        
        for (int i = 2; i <= n; i++) { // 2 3 4
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }
        
        return answer;
    }
}