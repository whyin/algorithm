import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}