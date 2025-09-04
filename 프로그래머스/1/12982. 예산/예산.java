import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;
        
        for (int cost : d) {
            if (budget - cost >= 0) {
                budget -= cost;
                result++;
            } else break;
        }
        return result;
        
    }
}