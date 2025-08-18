import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            queue.offer(days);
            }
        
        Queue<Integer> answer = new LinkedList<>();
        int d = queue.poll();
        int count = 1;
        while(!queue.isEmpty()) {
            int n = queue.poll();
            if(d >= n) {
                count++;
                continue;
            }
            answer.offer(count);
            count = 1;
            d = n;
        }
        
        answer.offer(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}