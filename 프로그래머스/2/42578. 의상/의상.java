import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int len = clothes.length;

        for (int i = 0; i < len; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        int temp = 1;

        for (String s : map.keySet()) {
            temp *= (map.get(s) + 1);
        }
        
        int answer = temp - 1;

        return answer;
    }
}