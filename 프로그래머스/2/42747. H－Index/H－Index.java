import java.util.*;


class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // [3, 0, 6, 1, 5] [0, 1, 3, 5, 6] 
        
        int n = citations.length;
        
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 5 
            if(citations[i] >= h) return h;
        }
        return 0; 
        
    }
}