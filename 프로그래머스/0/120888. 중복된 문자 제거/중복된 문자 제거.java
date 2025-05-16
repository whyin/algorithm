import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public String solution(String my_string) {
       Set<String> set = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            set.add(String.valueOf(c));
        }
        System.out.println(set);
        String answer = "";

        for (String s : set) {
            answer += s;
        }
        return answer;
    }
}