class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    
                    if (num < 2) continue;
                    boolean isPrime = true;
                    for (int d = 2; d * d <= num; d++) {
                        if (num % d == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) answer++;
                    
                }
            }
        }

        return answer;
    }
}