import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int max = Math.max(wallet[0], wallet[1]);
        int min = Math.min(wallet[0], wallet[1]);
        
        int count = 0;
        
        int a = bill[0];
        int b = bill[1];
        
        while (!(Math.max(a,b) <= max && Math.min(a,b) <= min)) {
            if (a >= b) a /= 2;
            else b /=2;
            
            count++;
        }
        
        return count;
        
    }
}
