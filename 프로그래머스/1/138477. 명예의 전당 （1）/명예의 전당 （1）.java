import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] answer = new int[n];
        PriorityQueue<Integer> hof = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int s = score[i];
            
            if (hof.size() < k) {
                hof.offer(s);
            } else if (s > hof.peek()) {
                hof.poll(); // 가장 작은 값 빼기
                hof.offer(s);
            }
            answer[i] = hof.peek();
        } 
        return answer;
    }
}