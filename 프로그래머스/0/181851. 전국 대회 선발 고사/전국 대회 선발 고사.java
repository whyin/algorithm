import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // rank와 index를 함께 저장할 PriorityQueue (등수 오름차순)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        // 참석 가능한 학생만 우선순위 큐에 넣음
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                pq.offer(new int[]{rank[i], i});  // {등수, 학생번호}
            }
        }

        // 등수 높은 순으로 3명 뽑음
        int a = pq.poll()[1];
        int b = pq.poll()[1];
        int c = pq.poll()[1];

        return 10000 * a + 100 * b + c;
    }
}
