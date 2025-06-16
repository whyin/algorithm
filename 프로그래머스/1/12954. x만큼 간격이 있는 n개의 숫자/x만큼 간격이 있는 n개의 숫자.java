import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();

        long start = x;
        long step = x;
                
        for(int i = 0; i < n ;i++){
            list.add(start + step * i);
        }
        
        long[] answer = new long[list.size()];
        
        for(int i = 0; i < n ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}