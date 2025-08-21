import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wMin = Math.min(wallet[0], wallet[1]);
        int wMax = Math.max(wallet[0], wallet[1]);

        long a = bill[0];   // 지폐 가로
        long b = bill[1];   // 지폐 세로
        int folds = 0;

        // 회전 가능하므로 (작은 변 ≤ 지갑 작은 변) && (큰 변 ≤ 지갑 큰 변) 이면 종료
        while (!(Math.min(a, b) <= wMin && Math.max(a, b) <= wMax)) {
            if (a >= b) a /= 2;     // 긴 변만 접기
            else        b /= 2;
            folds++;
        }
        return folds;
    }
}
