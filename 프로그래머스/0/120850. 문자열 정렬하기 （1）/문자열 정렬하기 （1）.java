import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (char n : my_string.toCharArray()) {
            if (Character.isDigit(n)) {
                answer.add(Character.getNumericValue(n));
            }
        }
        Collections.sort(answer);

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}