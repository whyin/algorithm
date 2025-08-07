import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d); // 오름차순 정렬
        int count = 0;   // 지원해 줄 수 있는 부서 수

        for (int cost : d) {
            if (budget - cost >= 0) {
                budget -= cost;
                count++;
            } else {
                break; // 예산이 부족하면 반복 종료
            }
        }

        return count;
    }
}