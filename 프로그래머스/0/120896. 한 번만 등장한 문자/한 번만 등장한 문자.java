import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>();

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                list.add(c);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}