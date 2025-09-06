import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] cnt = new int[N + 1];
        double[] rate = new double[N + 1];
        
        
        // 전체 인원
        int len = stages.length;
        
        for (int s : stages) {
            if (1 <= s && s <= N) {
                cnt[s]++;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            int fail = cnt[i];
            rate[i] = (len == 0) ? 0.0 : (double) fail / len;
            len -= fail;
        }
        
        
        List<Integer> order = new ArrayList<>();
        for (int i = 1; i <= N; i++) order.add(i);

        // 실패율 내림차순, 동률이면 스테이지 번호 오름차순  
        order.sort((a, b) -> {
            int cmp = Double.compare(rate[b], rate[a]);
            return (cmp != 0) ? cmp : Integer.compare(a, b);
        });

        // 정렬된 순서대로 answer 채우기
        for (int i = 0; i < N; i++) {
            answer[i] = order.get(i);
        }
        
        return answer;
    }
}