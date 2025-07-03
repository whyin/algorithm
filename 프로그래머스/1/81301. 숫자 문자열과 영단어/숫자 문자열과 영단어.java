import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> map = Map.of(
                "zero", "0",
                "one", "1",
                "two", "2",
                "three", "3",
                "four", "4",
                "five", "5",
                "six", "6",
                "seven", "7",
                "eight", "8",
                "nine", "9"
        );
        String answer = "";
        for (String key : map.keySet()) {
            s = s.replace(key, map.get(key));
        }
        return Integer.parseInt(s);
    }
}