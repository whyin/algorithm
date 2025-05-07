import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (list.size() == k) {
                break;
            } else if (!list.contains(num)) {
                list.add(num);
            }
        }
        while (list.size() < k) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}