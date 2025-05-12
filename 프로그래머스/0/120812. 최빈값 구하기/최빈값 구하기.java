import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int max = 0, mode = -1;
        boolean duplicate = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (val > max) {
                max = val;
                mode = key;
                duplicate = false;
            } else if (val == max) {
                duplicate = true;
            }
        }

        return duplicate ? -1 : mode;
    }
}