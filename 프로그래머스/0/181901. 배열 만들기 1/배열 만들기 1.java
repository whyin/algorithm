import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> answer = new ArrayList();
        for (int i = 1; i * k <= n; i++) {
            answer.add(i * k);
        }
        return answer;
    }
}