/*
* 8 10 1234 10  22 
*/

class Solution {
    public int solution(int n) { // 5
        int count = 0;
        
        int start = 1;
        int end = 1;
        int sum = 1;
        
        while (start <= n) {
            if (sum == n) {
                count++;
                sum -= start;
                start++;
                
            } else if (sum < n) {
                end++;
                sum += end;
                
            } else if (sum > n) {
                sum -= start;
                start++;
            }
        }
        return count;
    }
}