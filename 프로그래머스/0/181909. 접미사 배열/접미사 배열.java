import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = my_string.length(); i > 0; i--) {
            list.add(my_string.substring(i-1));
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}