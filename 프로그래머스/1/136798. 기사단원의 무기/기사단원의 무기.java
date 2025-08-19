class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] result = new int[number];
        
        for (int i = 1; i <= number; i++) {
            result[i-1] = getDivisorCount(i);
        }
        int answer = 0;
        for (int i = 0; i < number; i++) {
            answer += result[i] > limit ? power : result[i];
            //answer += result[i]
        }
        
        return answer;
    }
    
    public static int getDivisorCount(int n) {
            int count = 0;
            
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i * i == n) count++;   // 제곱수인 경우 약수 하나만 추가
                    else count += 2;           // i와 n/i 둘 다 약수
                }      
            }
            return count;
        }
    
    
}