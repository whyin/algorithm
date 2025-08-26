import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int n : scoville) {
            pq.add(n);
        } 
        
        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            
            int mixed = first + (second * 2);
            
            pq.add(mixed);
            
            answer++;
        }
        
        return pq.peek() >= K ? answer : -1;
    }
}